package collection02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Iterator {//迭代器

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (int i = 1; i<list.size();i++){
            System.out.println(list.get(i));
        }


        java.util.Iterator iterator = list.iterator();


        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("next = " + next);
        }


        System.out.println("iterator ======================= ");





        Set set = new HashSet();

        set.add("张1");
        set.add("张2");
        set.add("张2123");
        set.add("张2223");
        set.add("张2333");
        set.add("张234");
        set.add("张3");


        java.util.Iterator iterator1 = set.iterator();

        while (iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println("next = " + next);
        }



    }

}
