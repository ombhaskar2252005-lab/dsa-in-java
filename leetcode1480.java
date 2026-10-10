import java.util.*;
public class leetcode1480{
    public static int[] sum(int nums[]){
        for (int i =1; i<nums.length; i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String args[]){
        int nums[] = {1,2,4,6};
        int result[] = sum(nums);
        System.out.println(Arrays.toString(result));
    }
}
