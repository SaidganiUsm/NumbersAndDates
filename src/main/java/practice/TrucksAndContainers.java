package practice;

import java.util.Scanner;

public class TrucksAndContainers {
    public static String NEWLINE = System.lineSeparator();
    public static char TAB = '\t';
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        int maxBoxes = 27;
        int maxContainers = 12;
        int container = 0;
        int truck = 0;

        if (boxes <= 0) {

        } else if (boxes > maxBoxes) {
            container++;
            truck++;
            System.out.println("Грузовик: " + truck + NEWLINE +
                    TAB + "Контейнер: " + container);
        } else if (boxes <= maxBoxes) {
            container++;
            truck++;
            System.out.println("Грузовик: " + truck + NEWLINE +
                    TAB + "Контейнер: " + container);
        }
        for (int i = 1; i <= boxes; i++) {
            System.out.println(TAB + "" + TAB + "Ящик: " + i);
            if (i % (maxBoxes * maxContainers) == 0) {
                truck++;
                System.out.println("Грузовик: " + truck);
            }
            if (i % maxBoxes == 0) {
                if (boxes != maxBoxes){
                    container++;
                    System.out.println(TAB + "Контейнер: " + container);
                }
            }
        }

        System.out.println("Необходимо:" + NEWLINE +
                "грузовиков - " +  truck  + " шт." + NEWLINE +
                "контейнеров - " +  container  + " шт.");

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
