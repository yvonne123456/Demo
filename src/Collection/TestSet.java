package Collection;
//无序不可重复
//底层实现用的是hashMap
//测试set的常用方法，

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        Set set = new HashSet();

        set.add("aaa");
        set.add("bbb");
        set.add(new String("aaa"));
        System.out.println(set.size());

        System.out.println(set.contains("aa"));
    }
}
