package Scanner;

import java.util.Scanner;

public class Test {
    public static void Test01(){

         Scanner s = new Scanner(System.in);

         String str = s.next();

         System.out.println("键盘输入"+str);

    }
     public static void Test02(){
        Scanner s = new Scanner(System.in);

      System.out.println("请输入一个加数");

        int a = s.nextInt();

         System.out.println("请输入另一个加数");
         int b  = s.nextInt();
         int c = a+b;
         System.out.println("和为"+c);
    }
     public static void main(String[] args) {
         Test02();
    }
}







