package Collection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Test {
    public static void main(String[] args) {



        List list1 = new ArrayList();

        list1.add("aaa");

        list1.set(0,1);

        list1.get(0);

        list1.remove(1);



        list1.add("a");

        list1.set(0,1);

        list1.get(1);

        list1.remove(1);





        //ArrayList:底层实现数组，所以、查询快。修改、插入、删除慢。线程不安全，效率高
        //linkedList:底层实现是链表，所以、查询慢 修改、插入、删除快。线程不安全，效率高
        //Vector:线程安全、效率低。
          //跟顺序的操作
    }
}
