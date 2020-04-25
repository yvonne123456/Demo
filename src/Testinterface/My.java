package Testinterface;

public class My implements MyInterface {
    @Override
    public void test01() {
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println("My.test02()");
        return a+b;
    }
}
