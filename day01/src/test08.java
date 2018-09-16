import java.util.ArrayList;

public class test08 {
    public static void main(String[] args) {
        String str = "{{{[}]}}";
        boolean show = show(str);
        System.out.println(show);
    }
    private static boolean show(String str) {
        if(str.length() % 2 != 0){return false;}
        if(str.length()==0){return true;}
        char[] chars = str.toCharArray();
        int [] arr = new int[6];
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '{'){ arr[0]++; }
            if(chars[i] == '}'){ arr[1]++; }
            if(chars[i] == '['){ arr[2]++; }
            if(chars[i] == ']'){ arr[3]++; }
            if(chars[i] == '('){ arr[4]++; }
            if(chars[i] == ')'){ arr[5]++; }
        }
        boolean b1 = false;
        boolean b = arr[0] == arr[1] && arr[2] == arr[3] && arr[4] == arr[5];
        if(str.length() > 2 && b){
        for(int i = 0;i < chars.length/2;i++){
            if(chars[i] == '{'){
                for(int j = i+1;i< chars.length;j++){
                    if(chars[j] == '}'){
                        if((j-i) == 2 && (chars[j-1] == '{'|| chars[j-1] == '}')){
                            b1 = true;
                        }else {
                                b1 = (j-i) % 2 != 0; break;
                        }
                    }
                }
                if(b1 == false ){
                    break;
                }
            }
            if(chars[i] == '['){
                for(int j = i+1;i< chars.length;j++){
                    if(chars[j] == ']'){
                        if((j-i) == 2  && (chars[j-1] == '['||chars[j-1] == ']')){
                            b1 = true;
                        }else {
                                b1 = (j-i) % 2 != 0; break;
                        }
                    }

                }
                if(b1 == false ){
                    break;
                }
            }
            if(chars[i] == '('){
                for(int j = i+1;i< chars.length;j++){
                    if(chars[j] == ')'){
                        if((j-i) == 2 && (chars[j-1] == '('||chars[j-1] == ')')){
                            b1 = true;
                        }else {
                                b1 = (j-i) % 2 != 0; break;
                        }
                    }
                }
                if(b1 == false ){
                    break;
                }
            }
        }
        }

        if(str.length() <= 2){
            return b;
        }else {
            if (b&&b1){
                return true;
            }else {
                return false;
            }
        }

    }
}
