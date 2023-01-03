package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Birthdays {
    public static String NEWLINE = System.lineSeparator();
    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;
        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        int number = 0;
        SimpleDateFormat format = new SimpleDateFormat(" - dd.MM.yyyy - EE", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar(year, month - 1, day, 0, 0, 0);
        StringBuilder stBuilder = new StringBuilder();
        Calendar today = Calendar.getInstance();
        while (calendar.before(today)) {
            stBuilder.append(number).append(format.format(calendar.getTime())).append(NEWLINE);
            calendar.add(Calendar.YEAR, 1);
            number++;
        }
        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        return stBuilder.toString();
    }
}
