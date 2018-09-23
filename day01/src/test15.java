public class test15 {
    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "1";
        String s3 = addBinary(s1,s2);
        System.out.println(s3);
    }

    public static String addBinary(String a, String b)  {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        if(aArray.length>=bArray.length){
            return addBinary(aArray,bArray);
        }
        return addBinary(bArray,aArray);
    }

    public static String addBinary(char[] aArray,char[] bArray){

        int target = 0;
        int initIndex = aArray.length-bArray.length;
        for(int i = bArray.length-1;i>=0;i--){
            int temp = (int)aArray[initIndex+i]+(int)bArray[i]+ target - (int)'0';
            if(temp>'1'){
                aArray[initIndex+i] = (char)(temp - 2);
                target = 1;
            }else {
                aArray[initIndex+i] = (char)temp;
                target = 0;
            }
        }
        if(target == 0){
            return String.valueOf(aArray);
        }
        for(int i = initIndex - 1;i>=0;i--){
            if(aArray[i]=='0'){
                aArray[i]++;
                return String.valueOf(aArray);
            }
            aArray[i]--;
        }
        return "1"+String.valueOf(aArray);
    }
}
