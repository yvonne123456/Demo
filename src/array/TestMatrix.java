package array;

    public class TestMatrix {

        public static void print(int[][] c){
            // 打印矩阵
            for (int i = 0; i<c.length;i++){
                for (int j = 0;j<c.length;j++){

                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }
        }
        public static int[][] add(int[][]a, int[][] b) {
            int[][] c = new int[a.length][a.length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }

            }
            return c;
        }

        public static void main(String[] args) {
            int[][] a = {
                    {1,3},
                    {2,4}
            };//z直接初始化

            int[][] b = {
                    {3,4},
                    {5,6}
            };
            int[][] c = add(a,b);//  2节矩阵结果
       // c[0][0] = a[0][0]+b[0][0];// 用循环控制代码

        print(c);



        }


    }
