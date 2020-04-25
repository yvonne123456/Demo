package Collection;

import java.util.HashMap;
import java.util.Map;

//测试Map的基本用法
public class TestMap {


    public static void main(String[] args) {
        Map map = new HashMap();//通过一个对象找另一个对象 这个对象成对存放
        map.put("张三",new Wife("李四"));

     Wife w  =   (Wife) map.get("张三");
        map.remove("张三");
        System.out.println(w.name);
    }
    }
class Wife{
    String name;
    public Wife(String name){
        this.name = name;
    }
}
