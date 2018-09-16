//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
//你可以假设数组中无重复元素。
import java.util.ArrayList;

public class test10 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int a = 0;
        int show = show(arr, a);
        System.out.println(show);
    }

    private static int show(int[] arr, int a) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean b = true;
        if(arr[arr.length-1] < a){
            return arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] == a || arr[i] > a) && b){
                list.add(a);
                b = false;
            }
            list.add(arr[i]);
        }
        int nume = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == a){
                nume = i;break;
            }
        }
        return nume;
    }
}
