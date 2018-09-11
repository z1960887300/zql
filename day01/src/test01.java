import com.sun.jdi.event.ThreadStartEvent;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 1.创建一个方法给他传递一个数组还有一个目标值
 2.遍历数组找到其中两个数中的值的和为目标
  所以需要两个for完成
 */
public class test01 {
    public static void main(String[] args) throws  IllegalArgumentException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        int arr[] = {1,2,7,11,15,101};
        int s = 108;
        //ArrayList<String> show = show(arr, s);
        //System.out.println(show);
        int[] ints = twoSum(arr, s);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private static ArrayList<String> show(int[] arr, int s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1;j < arr.length;j++  ){
                if((arr[i]+arr[j]) == s){
                    list.add(i+"和"+j);

                }
            }
        }
        return list;
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
