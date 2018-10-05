import java.util.Arrays;

public class test22 {
    public static void main(String[] args) {
        int [] a ={2,3,3};
        int i = majorityElement(a);
        System.out.println(i);
    }
    public static int majorityElement(int[] nums) {
        if(nums.length==1) {
            return nums[0];
        }
        int count=0;
        int n=0;
        int a=0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++) {
            if(nums[i]==nums[i+1]) {
                count++;
            }else {
                count=0;
            }
            if(count>n) {
                n=count;
                a=nums[i];
            }
        }
        return a;

    }
}
