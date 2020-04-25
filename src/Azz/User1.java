package Azz;

public class User1 {
    public static void main(String[] args){
        MyMath y = new MyMath();
        int z = y.add(4,5 ,8);
        System.out.println(z);

    }



}

class MyMath {
    public int add(int a, int b){
        return  a+b;
    }
    public int add(int a ,int b, int c){
        return a+b+c;
    }
}