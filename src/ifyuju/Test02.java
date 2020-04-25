package ifyuju;


public class Test02 {
    public static void main(String[] args) {
        int c =0;
        int d =0;
        for(int i = 1; i<=100;i++){
            if (i%2!=0){
                c+=i;
            }else {
                d+=i;
            }
        }
        System.out.println("奇数和"+c);
        System.out.println("偶数和"+d);
    }
}