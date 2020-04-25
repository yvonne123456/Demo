package Shuzu;

public class B {
    public static void main(String[] args) {
    /*
    1.数组是相同数据类型的（任意类型）有序集合
    2.数组也是对象，数组元素相当于成员变量
    3.数组长度确定.不可变的，如果越界报异常Index
     */
       // 声明
    int[]b;
       //初始化，创建对象
        int[] c = new int[3];
        c[0]=11;
        c[1]=12;
        c[2]=13;
    Car[] cars = new Car[4];
    cars [0] = new Car("奥迪");

   System.out.println(cars[0].name);

        System.out.println(c.length);
        for (int i = 0; i<c.length;i++){
            System.out.println(c[i]);
        }
    }


}
