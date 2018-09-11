

/*
    给定一个 32 位有符号整数，将整数中的数字进行反转
 */
public class test02 {
    public static void main(String[] args) {
        System.out.println(show(-120));
    }

    private static int   show(int a ) {
        int i = 0;
           if(a < 0){
               a = a * -1;
            String s = a+"";
            StringBuilder sb  = new StringBuilder(s);
            String s1 = sb.reverse().toString();
             i = Integer.parseInt(s1) * -1;

           }else {
               String s = a+"";
               StringBuilder sb  = new StringBuilder(s);
               String s1 = sb.reverse().toString();
               i = Integer.parseInt(s1) ;

           }
    return  i;

    }
}
