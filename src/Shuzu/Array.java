package Shuzu;

public class Array {
    public static void main(String[] args) {
        int[] a;

        int[] b = new int[3];

        b[0] = 0;
        b[1] = 1;
        b[2] = 2;

//        for (int i : b) {
//            System.out.println("i = " + i);
//        }
        //将数组中第二个元素乘3，并输出该数组
        for (int i = 0; i < b.length; i++) {
            if (i == 1){
                b[i] = b[i]*3;
            }
            System.out.println("b = " + b[i]);
        }

        //输入：arr = [37,12,28,9,100,56,80,5,12]
        //输出：[5,3,4,2,8,6,7,1,3]
       int[] arr = {37,12,28,9,100,56,80,5,12};

        for (int i = 1; i<arr.length;i++){


        }


        }

    }


