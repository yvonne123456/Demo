package Collection;

public class SxtLinkedList  {

   private   Node first;
   private  Node last;
   private int size;


   public void add(Object obj){
       Node n  =  new Node();
       if (first==null){

           n.setPrevious(null);
           n.setObj(obj);
           n.setNext(null);

           first = n;
           last = n;
       }else {
           //直接在last节点后增加节点
           n.setPrevious(last);
           n.setObj(obj);
           n.setNext(null);

           last.setNext(n);

           last = n;

       }
       size++;
   }

   public int size() {
       return size;
    }
    public void rangeCheck(int index){

    if (index<0||index>=size){
        try{
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
    public  Object get(int index) {

        rangeCheck(index);
        //0 1 2 3 4
        Node temp = null;
        if (first != null) {

            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        return temp.obj;
    }

    public void remove(int index){
        Node temp = null;
        if (first != null) {

            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        if (temp!=null){
            Node up = temp.previous;
            Node down = temp.next;

            up.next = down;
            down.previous= up;
            size--;
        }
   }


   public void add(int index,Object obj){

   }
   public static void main(String[] args) {
       SxtLinkedList list  = new SxtLinkedList();

        list.add("aaa");

        list.add("aaa");

        System.out.println(list.get(2));
   }


}

