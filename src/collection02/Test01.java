package collection02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {

    public static void main(String[] args)  {
        Employee  emp = new Employee(0301,"张三",3000,"项目部","2017-10");
        Employee  emp1 = new Employee(0301,"李三",3000,"项目部","2016-9");
        Employee  emp2 = new Employee(0301,"李三",3000,"项目部","2016-9");
        Employee  emp3 = new Employee(0301,"李三",3000,"项目部","2016-9");

        List<Employee> list =  new ArrayList<Employee>();
            //
        list.add(emp);

        list.add(emp1);

        list.add(emp2);

        list.add(emp3);
        // 获取迭代器

        list.remove(1);
        Iterator<Employee> iterator = list.iterator();
        //判断是否有下一个

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //






        System.out.println("\"================\" = " + "================");
        
        printName(list);

        printId(list);

        printHireDate(list);
    }

    public  static  void printName(List<Employee>list){
        for (int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i).getName());
        }
    }

    public  static  void printId(List<Employee>list){
        for (int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i).getId());
        }
    }
    public  static  void printHireDate(List<Employee>list){
        for (int i = 0 ; i<list.size();i++){
            System.out.println(list.get(i).getHireDate());
        }
    }


}
