package Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//测试日期类
public class TestCalendar {
    public static void main(String[] args) {
        Calendar a = new GregorianCalendar();
    //    a.set(2001,1,10,12,23,34);//
        a.set(Calendar.YEAR,2001);
        Date d = a.getTime();
        System.out.println(d);
        System.out.println(a.get(Calendar.YEAR));
    }

}
