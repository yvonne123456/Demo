package Date;

import java.text.DateFormat;//抽象类不能自己建
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//时间格式化
public class TestDateFormat {

    public static void main(String[] args) throws ParseException {


        Date  date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String format = simpleDateFormat.format(date);

        System.out.println("当前时间"+format);

        String time = "1999.09.09 12:12:12";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

        Date parse = dateFormat.parse(time);

        System.out.println("parse = " + parse);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
        String format1 = now.format(dateTimeFormatter);
        System.out.println("format1 = " + format1);


    }

}
