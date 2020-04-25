package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test04 {
    public static <Date> void main(String[] args) {

        System.out.println("请输入日期：2020-3-10");
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        DateFormat format = new SimpleDateFormat("yy-MM-dd");
        int maxDate = 0;
        Calendar calendar = null;
        try {
            java.util.Date c = format.parse(a);
            calendar = new GregorianCalendar();
            calendar.setTime(c);

            calendar.set(Calendar.DATE, 1);

            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

            System.out.println();

            maxDate = calendar.getActualMaximum(Calendar.DATE);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("日\t一\t二\t三\t四 \t五\t六");

        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {

            System.out.print("\t");
        }


        for (int i = 1; i <= maxDate; i++) {
            System.out.print(i + "\t");

            int w = calendar.get(Calendar.DAY_OF_WEEK);
            if (w == Calendar.SATURDAY) {
                System.out.print('\n');
            }
            calendar.add(Calendar.DATE, 1);

        }

    }
}
