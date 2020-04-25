package Duixiang;

public class Student {
    //静态数据
        String name;//属性
      int  age;
      int  id;
      Computer computer;
    //动态行为
public void study(){
        System.out.println(name+"在学习");
    }
public  void  sayHello(String a){
    System.out.println(name+"向"+a+"说：您好");
    }
    public static void main(String[] args) {
    Student a = new Student();
    a.name="张三";
    a.study();
    a.sayHello("李四");



    }
}