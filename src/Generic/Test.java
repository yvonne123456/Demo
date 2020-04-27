package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//泛型是一种未知的数据类型,当我们不知道使用什么数据类型 ,可以用泛型
//泛型也可以看成一个变量,用来接收数据
//创建对象的时候会确定泛型的数据类型
public class Test {
    public static void main(String[] args) {
        show1();
    }
    //创建集合,使用泛型
    //1.好处避免了类型转换的麻烦存储什么类型,取出就是什么类型
    //2.把运行期异常(代码运行后抛的异常),提升到编译器(写代码的时候会报错)
    //弊端:泛型是什么类型只能存储什么类型的数据)
    private static void show1() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        list.add("bcf");


        //迭代器遍历list集合;
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String S = it.next();
            S.equals("bcd");
            if ( S.equals("bcd")){
                it.remove();
                continue;
      }
            System.out.println(S+"->"+S.length());
        }

        ListIterator<String> stringListIterator = list.listIterator();



    }

    private static void show() {
        // 创建集合对象,不使用泛型 好处:集合不使用泛型,默认的类型就是Object类型可以存储任意数据
        // 弊端,不安全 引发异常
          ArrayList list = new ArrayList();
          list.add("abc");
          list.add(123);
          list.add(1233);
          Iterator it = list.iterator();
          //使用迭代器的方法hasNext和next遍历;
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法,length获取字符长度; 不能使用 多态Object obj = "abc"
            //需要向下转型
            //会抛出ClassCastException类型转换异常,不能把Integer类型转换为String类型
            String S = (String)obj;
            System.out.println(S.length());


        }
    }
}
