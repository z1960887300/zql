import java.util.ArrayList;

/*
给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 1.创建一个方法给他传递一个数组还有一个目标值
 2.遍历数组找到其中两个数中的值的和为目标
  所以需要两个for完成
 */
public class test01 {
    public static void main(String[] args) {
        int arr[] = {1,2,7,8,11,15};
        int s = 9;
        ArrayList<String> show = show(arr, s);
        System.out.println(show);
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

}
