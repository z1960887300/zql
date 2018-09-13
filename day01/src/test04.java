/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class test04 {
    public static void main(String[] args) {
        boolean show = show(-121);
        System.out.println("是否是回文:"+show);
    }

    private static boolean show(int i) {
        if(i < 0){
            return false;
        }else {
        Integer s1 = i;
        int s = 0;
       while (s1 != 0){
           int i1 = s1% 10;
           s1 = s1 / 10;
           s = s*10+i1;
       }
       if(s == i){
           return  true;
       }else {
           return  false;
       }
    }
    }
}
