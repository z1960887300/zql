import java.util.ArrayList;

public class test06 {
    public static void main(String[] args) {
        String[ ] str = {"a"};
        String show = show(str);
        System.out.println(show);

    }

    private static String  show(String[] str) {
        if(str.length == 0){return "";}
        if(str.length == 1){
        return  str[0];
        }
        int [] a = new int [str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = str[i].length();
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(min > a[i]){
                min = a[i];
            }
        }
       /* if(j-i == 2){
            b1 = ((j+1) -(i+1)) % 2 != 0; break;
        }*/
        String ss = "";
        boolean b = false;
        for (int i = 0; i < min; i++) {
           String s1 = str[0].substring(0,i+1);
            for (int j = 1; j < str.length; j++) {
                if(str[j].substring(0,i+1).equals(s1)){
                    b = true;
                }else{
                    b = false;break;
                }
            }
            if(b == true){
                ss = s1;
            }
        }
        return ss;
    }
}
