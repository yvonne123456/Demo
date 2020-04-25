package Date;

import java.util.Date;

//测时间Date时间类的用法  核心   就那个数  然后表示那个数
public class Test {
    public static void main(String[] args) {
        Date  d = new Date();
        long a =  System.currentTimeMillis();
        System.out.println(a);
        Date d2 = new Date(1000);

        System.out.println(d2.getTime());
        System.out.println(d2.toGMTString());//不使用
    }

}
