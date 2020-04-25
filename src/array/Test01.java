package array;//二数组 ，数组元素还是数组
//数组都是引用类型

public class Test01 {
    public static void main(String[] args) {//静态初始化
      //  int[][] a = {
        //        {1, 2},//数组对象
            //    {3, 4, 0, 9},//一个数组得4个元素
     //           {5, 6, 7}
        int [][] a = new int [3][];//一维数组长度，
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 0;
        a[1][3] = 9;

        a[2][0] = 5;
        a[2][1] = 6;
        a[2][2] = 7;



    }
    }
