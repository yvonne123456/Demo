package Generic;



public class Demo {
    public static void main(String[] args) {
        Test01 te = new Test01();
        te.setName("只能是字符串");
       Object obj = te.getName();

       //创建GenericClass对象,使用Integer类型
         Test01<Integer> te2 = new Test01<>();
         te2.setName(1);
       Integer name =te2.getName();
       System.out.println(name);
}
}