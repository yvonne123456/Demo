package Collection;
//自定义Map的升级版
//提高查询效率
//Map底层实现是数组+链表
//如果equals为true则hashcode肯定相等
import java.util.LinkedList;

public class TestMap002 {

    LinkedList[]  arr  = new LinkedList[9];
    int size;

    public void put(Object key,Object value){
        SxtEntry  e = new SxtEntry(key,value);

        int hash = key.hashCode();
        hash = hash<0?-hash:hash;

        int a = hash%arr.length;
        if(arr[a]==null){
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);
        }else{
            LinkedList list = arr[a];
            for(int i=0;i<list.size();i++){
                SxtEntry e2 = (SxtEntry) list.get(i);
                if(e2.key.equals(key)){
                    e2.value = value;
                    return;
                }
            }

            arr[a].add(e);
        }
        //a:1000-->1   b:10000-->13
    }

    public Object get(Object key){
        int a = key.hashCode()%arr.length;
        if(arr[a]!=null){
            LinkedList list = arr[a];
            for(int i=0;i<list.size();i++){
                SxtEntry e = (SxtEntry) list.get(i);
                if(e.key.equals(key)){
                    return e.value;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TestMap002 m = new TestMap002();
        m.put("张三", new Wife("李四"));
        m.put("张三", new Wife("李二"));
        Wife w = (Wife) m.get("张三");
        System.out.println(w.name);
    }
}
