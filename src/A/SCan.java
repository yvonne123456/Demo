package A;

import java.util.Scanner;

public class SCan {
    public static void main(String[] args) {

        System.out.println("请输入第一位数");

        Scanner y = new Scanner(System.in);

        int a = y.nextInt();

        System.out.println("请输入第二位数");

        int b = y.nextInt();

        System.out.println("请输入符号");

        int c = y.nextInt();

    //1 +, 2 -, 3 *,4 /

   if(c==1){
       System.out.println("和为"+(a+b));
   }

    }
}
