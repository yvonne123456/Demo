package File;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        show02("c；","a.txt");
    }

    private static void show02(String parent,String child) {

        File file = new File(parent,child);
        System.out.println(file);
    }







  //  private static void show01() {

      //  File f1 = new File("d:\\1\\zhangsan");
    //    System.out.println(f1);
       // File f2 = new File("d.java");
      //  System.out.println(f2);
    //}


}
