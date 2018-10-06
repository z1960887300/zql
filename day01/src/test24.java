public class test24 {
    public static void main(String[] args) {
       int a = 3;
        int i = trailingZeroes(a);
        System.out.println(i);
    }
    public static int trailingZeroes(int n) {
        int count = 0;
        while(n>0){
            count+=n/5;
            n/=5;
        }
        return count;
    }


}
