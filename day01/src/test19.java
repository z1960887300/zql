public class test19 {
    public static void main(String[] args) {
        int []numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(numbers, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] index = new int[2];
        for (int i = 0;i<numbers.length;i++){
            for (int j = i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j] == target){
                    index[0] = i+1;
                    index[1] = j+1;

                }
            }
        }
        return index;
    }
}
