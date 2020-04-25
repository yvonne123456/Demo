package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06 {
public static void main(String[] args){

    Date date = new Date();

    SimpleDateFormat SimpleDateFormat  = new SimpleDateFormat("yyy-MM-dd hh-mm-ss" );

    String format = SimpleDateFormat.format(date);

    System.out.println("当前时间"+format);

    String time = "1997,08,09 10,42,30";

    SimpleDateFormat DateFormat = new SimpleDateFormat("yyy,MM,dd hh,mm,ss");

    try {
        Date parse = DateFormat.parse(time);


    } catch (ParseException e) {
        e.printStackTrace();
    }


}

}
