import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
*/
public class test05 {
    public static void main(String[] args) {
       String[ ] str = {"flower","olow","floght"};
        String show = show(str);
        System.out.println(show);
    }

    private static String show(String[] s) {
        char[] chars1 = s[0].toCharArray();
        char[] chars2 = s[1].toCharArray();
        char[] chars3 = s[2].toCharArray();
        int min = chars1.length;
        String ss = "";
        if(min > chars2.length && chars3.length > chars2.length ){
            min = chars2.length;
        }else if(min > chars3.length && chars2.length > chars3.length){
            min = chars3.length;
        }
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < min ; i++){
            if(chars1[i] == chars2[i] && chars1[i] == chars3[i]){
              list.add(chars1[i]);
            }else {
                break;
            }
        }
        for (Character character : list) {
            ss+=character+"";
        }
         if(ss.equals("")){
            return "null";
         }else {
            return ss;
         }
    }
}
