package testwrappedclass;
//测试包装类
public class test01 {
    public static void main(String[] args) {


        Integer a =new Integer(1000);//包装类对象

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.toHexString(a));//16制进转换

        Integer b = Integer.parseInt("345");//字符串直接装换

        Integer c = new Integer("34567");




        System.out.println(c.intValue());
    }


}
