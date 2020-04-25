package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Test05 {

    public static void main(String[] args) {

        String str  =  " 2020-4-14 21-38-20";
        DateFormat e = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        try {
            Date c = e.parse(str);
            System.out.println(c);

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
