package String;

public class String01 {
    public static void main(String[] args) {
        String str = "我是一个String";
        String[] a = str.split("S");//分割
        for (int i = 1; i<a.length;i++){
            System.out.println(a[i]);
        }
    char b = str.charAt(4);
        System.out.println(b);//截取一个字符

    String c = str.substring(3,str.length());//截取字符串中的子串
        System.out.println(c);

        String d = str.substring(2);
        System.out.println(d);

        int index = str.indexOf("S");//索引
        System.out.println(index);

        boolean e = str.equals("我是一个String");
        System.out.println(e);

        boolean f = str.endsWith("");//以什么结尾
        System.out.println(f);

        boolean g = str.startsWith("我");
        System.out.println(g);

    }
}
