public class Builder02 {
    public static void main(String[] args) {
        StringBuilder cc = new StringBuilder("abcdefghjklmnopqrstuvwhyz");
        cc.delete(3,5).delete(3,5);
        System.out.println(cc);

        cc.reverse();
        System.out.println(cc);//相反的

        StringBuffer aa = new StringBuffer();
    }
}
