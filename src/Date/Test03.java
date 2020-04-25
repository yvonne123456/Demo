package Date;

import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
// 获取当前时间（Date）
        Date a = new Date();
        System.out.println(a);

        Date b = new Date(10000L);
        System.out.println(b);

        long time = 1000L*2*60*40;
        Date c = new Date();
        c.setTime(time);
        System.out.println(c.getTime());
    }
}