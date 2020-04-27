package collection02;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {

    public static void main(String[] args) {
        Map map = new HashMap();
    //一个map对象对应一行记录
        map.put("id",001);
        map.put("name","张三");
        map.put("salary",3000);
        map.put("department","项目部");
        map.put("hireDate","2017-10");



        Map map1 = new HashMap();

        map1.put("id",002);
        map1.put("name","李三");
        map1.put("salary",3040);
        map1.put("department","项目部");
        map1.put("hireDate","2017-10");

        List<Map> list= new ArrayList<Map>();

        list.add(map);
        list.add(map1);

        printName(list);
        printHireDate(list);
    }

    public  static  void printName(List<Map>list){
        for (int i = 0 ; i<list.size();i++){

            Map tempMap =list.get(i);
            System.out.println(tempMap.get("name")+"--"+tempMap.get("salary"));
        }
    }

    public  static  void printHireDate(List<Map>list){
        for (int i = 0 ; i<list.size();i++){

            Map tempMap1 =list.get(i);
            System.out.println(tempMap1.get("hireDate"));
        }
    }
}
