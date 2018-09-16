import java.util.ArrayList;

public class test07 {
    public static void main(String[] args) {
        String str = "{}[]";
        boolean show = show(str);
        System.out.println(show);
    }

    private static boolean show(String str) {
        ArrayList<Character> list = new ArrayList<>();
        if(str.length() % 2 != 0||str.length()==0){return false;}
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        for (int i = 0; i < chars.length/2; i++) {
            if(list.get(i) == '{'){
                for(int j = i+1;j < list.size();j++){
                    if(list.get(j) == '}'){
                        list.remove(i);
                        list.remove(j);
                        break;
                    }
                }
            }
            if(list.get(i) == '['){
                for(int j = i+1;j < list.size();j++){
                    if(list.get(j) == ']'){
                        list.remove(j);
                        break;
                    }
                }
            }
            if(list.get(i) == '('){
                for(int j = i+1;j < list.size();j++){
                    if(list.get(j) == ')'){
                        list.remove(j);
                        break;
                    }
                }
            }

        }
        boolean b = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)=='}'||list.get(i)==']'||list.get(i)==')'){
                b = false;
            }else {
                b = true;
            }
        }
        return b;
    }
}
