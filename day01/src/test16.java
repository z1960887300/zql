public class test16 {
    public static void main(String[] args) {
        int b = 3;
        int a = climbStairs(b);
        System.out.println(a);
    }

    private static int climbStairs(int n) {
        int a = 1, b = 1, re = 0;
        if(n == 1 || n ==0){
            return 1;
        }
        while(--n > 0){
            re = a+b;
            b = a;
            a = re ;
        }
        return re;
    }
}
