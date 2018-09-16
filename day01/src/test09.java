public class test09 {
    public static void main(String[] args) {
        String a ="aaa";
        String b ="aaa";
        int i = strStr(a, b);
        System.out.println(i);
    }
    public static int strStr(String haystack, String needle) {
        /*char[] chars = haystack.toCharArray();
        char[] chars1 = needle.toCharArray();
        for (int i = 0,j = 0; i < chars.length; i++) {
           if(chars[i] == chars1[j]){
           }
        }*/
        if(needle.length() == 0 ){
            return  0;
        }
        if( haystack.length() ==0 || needle.length() > haystack.length()){
            return -1;
        }
        if(haystack.substring(0,1).equals(needle.substring(0,1))&&needle.length()==1){
            return 0;
        }
        String[] split = haystack.split(needle);
        if(split.length != 0){
        if(split[0].length() != haystack.length()){
            char[] chars = split[0].toCharArray();
            return chars.length;
        }else {
            return -1;
        }
        }else {
            return 0;
        }
    }
}
