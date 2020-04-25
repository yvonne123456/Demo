package Mycollection;//摸你实现jdk中提供ArrayList；
//容器的底层实现都包含数组
//模拟实现jdk中提供的MyList类
//容器也是一个对象;
public class MyList {
    //定义一个类
    /**
     * The value is used for object storage.
     */
   private Object[] value;
//Object(所有类都是它的子类 ，）
    /**
     * The size is the number of object used.
     */

   private int size;


   //构造器
    public MyList() {
        //value = new Object[16];
        this(10);
    }

    public MyList(int size) {

        if (size<0){
            try{
                throw new Exception();
    } catch (Exception e) {

                e.printStackTrace();
    }
    }
        value = new Object[size];
    }


    public int size (){
        return size;
    }
//添加,加东西/然后把object obj加到容器
    public void add(Object obj) {
        value[size] = obj;
        size++;

        if (size >= value.length) {
            int newCapacity = value.length * 2;
            Object[] newList = new Object[newCapacity];
            for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];
    }
            value = newList;
    }
    }
    // 传一个索引，底层是个数组
        public Object get(int index){
            if (index < 0 || index > size - 1) {//判断索引值在不在范围，不在会出现个异常[0,size]
                try {
                    throw new Exception();
                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
            return value[index];
        }

        public static void main(String[]  args){
            MyList list = new MyList(2);
            list.add("aaa");
            list.add(new Human("张三"));
            list.add("bbb");
            list.add("bbb");

            Human h = (Human) list.get(1);
            System.out.println(h.getName());
            System.out.println(list.get(2));
            System.out.println(list.size);
        }
    }




