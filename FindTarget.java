import java.util.Arrays;

public class FindTarget {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6};
        // System.out.println(find(arr, 5, 0));
        // }
        // static boolean find(int[] arr, int target, int index) {
        // if(index==arr.length) return false;
        // return arr[index] == target || find(arr, target, index+1);

        int[] nums = { 0, 1, 0, 3, 4 };
        find(nums);
         System.out.println(Arrays.toString(nums));
       
    }

    static void find(int[] nums) {
       
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length-i-1; j++) {
                if(nums[i]==0) {

                
                   int temp=nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
                }
            }
    }

}
}