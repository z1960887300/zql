/*
 给定一个 32 位有符号整数，将整数中的数字进行反转
 */
public class test03 {
    public static void main(String[] args) {
        System.out.println(show(-120));
    }
    private static int  show(int i) {
        int s = 0;
        while (i !=0){
            int i1 = i % 10;
            i = i/10;
            if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
                s = 0;
            }
            s = s * 10 + i1;
        }
        return s;
    }
}
