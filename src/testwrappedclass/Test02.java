package testwrappedclass;
//测试自动装箱和拆箱
public class Test02 {

    public static void main(String[] args) {
   //     Integer a = new Integer(1000);//
        Integer a = 1000;//jdk5.0 之后，自动装箱，编译器帮我们改进 a还是对象

        Integer b = 2000;
        int c = b;//编译器改进：new Integer(1500).intValue();//自动拆箱
        System.out.println(b);

        Integer d =  1234;
        Integer d2 =  1234;
        System.out.println(d==d2);
        System.out.println(d.equals(d2));
        System.out.println("#####################  ");

        Integer d3 =  -128;//[-128,127]之间的数，仍然当做基本数据类型处理，
        Integer d4 =  -128;
        System.out.println(d3==d4);
        System.out.println(d3.equals(d4));

    }
}
