package Collection;
//自己实现一个ArrayList，更好的理解ArrayList类的结构

import Shuzu.Array;

import java.util.ArrayList;

public class SxtArrayList {

    private Object[] elementData;//elementData(元素对象）
    private  int size;

    public int size(){
        return size;
    }
    public  boolean isEmpty(){
        return size==0;
    }


    public SxtArrayList(){
        this(10);
    }
    public SxtArrayList(int initialCapacity){
        if(initialCapacity<0){
            try{
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }
    public  void  add(Object obj){

        //数组扩容和数据拷贝
        if(size==elementData.length){
            Object[] newArray = new  Object[size*2+1];
          for(int i =0;i<elementData.length;i++){
                newArray[i] = elementData[i];
            }
          elementData=newArray;
        }
        elementData[size++]=obj;
    }
    public Object get(int index){
        if (index<0||index>=size){
           try{
               throw new Exception();
           } catch (Exception e) {
               e.printStackTrace();
           }
        }
        return elementData[index];
    }



        public static void main(String[] args) {

             SxtArrayList list = new SxtArrayList(3);
             list.add("3333");
             list.add("3333");
             list.add("4444");
             list.add("3333");
             System.out.println(list.size());
             System.out.println(list.get(3));
    }

}
