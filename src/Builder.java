public class Builder {
    public static void main(String[] args) {

        //可变字符系列StringBuilder(线程不安全，效率高）StringBuffer(线程安全，效率低）
        //StringBuilder 不可变字符系列

        StringBuilder sb1 = new StringBuilder();//字符初始长度为16；
        StringBuilder sb = new StringBuilder("32");

        sb1.append("abcd");
        sb1.append("efg").append("hjk").append("随便");//累加
        System.out.println(sb1);

        System.out.println("################################");

        StringBuilder gh = new StringBuilder("a");
        for (int i = 0; i<1000;i++){
            gh.append(i);
        }
        System.out.println(gh);
        }
        }
