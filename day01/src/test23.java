public class test23 {
    public static void main(String[] args) {
        String s = "ZY";
        int i = titleToNumber(s);
        System.out.println(i);
    }
    public static int titleToNumber(String s) {
        int n=s.length();
        int c=0;
        int tem=0;
        int b=1;
        char a;
        for(int i=n-1;i>=0;i--){
            a=s.charAt(i);
            tem=a-'A'+1;
            c=tem*b+c;
            b=b*26;
            }
    return c;
    }
}

