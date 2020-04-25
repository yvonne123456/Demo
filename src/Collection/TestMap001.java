package Collection;
//自定实现Map的功能
//存放键值对 ，根据键对象找对应的值对象
public class TestMap001 {

        SxtEntry[] Sxt = new  SxtEntry[300];

        int size;

        public void  put(Object key,Object value){

            SxtEntry e = new SxtEntry(key, value);
            Sxt[size++] = e;

        }

        public Object get(Object key){

            for (int i = 0; i<size;i++){
                if (Sxt[i].key.equals(key)){
                    return Sxt[i].value;
                }
            }
            return null;
        }

        public static void main(String[] args){

            TestMap001 m = new TestMap001();

            m.put("张三",new Wife("李四"));
            m.put("一二",new Wife("二四"));
                  Wife w =  (Wife) m.get("张三");

             System.out.println(w.name);
        }

}
class SxtEntry{

    Object key;
    Object value;


    public SxtEntry(Object key,Object value){
        super();
        this.key = key;
        this.value = value;//构造器
    }

}