public class test20 {
    public static void main(String[] args) {
        int i = 703;
        String s = convertToTitle(i);
        System.out.println(s);
    }

    public static String convertToTitle(int n) {
        String temp="";
        while(n>0) {
            char s=(char) ((n-1)%26+'A');
            temp=s+temp;
            n=(n-1)/26;
        }
        return temp;
        }
    }
