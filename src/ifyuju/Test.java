package ifyuju;

public class Test {
    public static void main(String[] args) {
        double a = Math.random();
        int e =1+(int) (a*6);
        System.out.println(e);
        if (e>3){
            System.out.println("大数");
        }else{
            System.out.println("小数");
        }
            System.out.println("测试多种结构");
        if(e==6){
            System.out.println("运气非常好");
        }else if (e==4){
            System.out.println("运气非常好");
        }else {
            System.out.println("运气不好");
        }

    }


}