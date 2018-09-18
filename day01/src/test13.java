public class test13 {
    public static void main(String[] args) {
        int  n = 2;
        String show = show(n);
        System.out.println(show);
    }
    public static String show(int n){
    StringBuilder pre;
    StringBuilder cur=new StringBuilder("1");
    int count;
        for(int i=1;i<n;i++){
        pre=cur;
        cur=new StringBuilder();
        count=1;
        for(int j=1;j<pre.length();j++){
            if(pre.charAt(j)!=pre.charAt(j-1)){
                cur.append(count).append(pre.charAt(j-1));
                count=1;
            }
            else{
                count++;
            }
        }
        cur.append(count).append(pre.charAt(pre.length()-1));
    }
        return cur.toString();
}
}
