public class test14 {
    public static void main(String[] args) {
        String s = "Today  ";
         int s1 = show(s);
        System.out.println(s1);

    }

    private static int show(String s) {
        boolean b = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                b = true;
            } else {
                b = false;
                break;
            }
        }

        if (b|| s.length()==0) {
            return 0;
        } else {
            String[] split = s.split(" ");
            int c = 0;
            for (int i = 0; i < split.length; i++) {
                if(split[i].length() > 0){
                    c = i;
                }
            }
                String s1 = split[c];
                return s1.length();

        }
    }
}
