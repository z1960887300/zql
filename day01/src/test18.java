public class test18 {
    public static void main(String[] args) {
        int [] a={1,2,1,2,3};
        int i = singleNumber(a);
        System.out.println(i);

    }
    public static int singleNumber(int[] nums) {
        int b = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0;i < nums.length;i++){
            for (int j=i+1; j < nums.length;j++){
                if(nums[i] == nums[j]){
                   nums[i]=0;
                   nums[j]=0;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                b = nums[i];
            }
        }
        return  b;
    }
}
