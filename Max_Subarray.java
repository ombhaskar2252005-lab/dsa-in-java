import java.util.*;
public class Max_Subarray {
    public static int max(int[] nums){
        int n = nums.length;
        int sum =0; 
        int max = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            sum = sum + nums[i];
            if(sum>max){
                max = sum;
            }
            if(sum <0){
                sum =0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = max(nums);
        System.out.println(result);
        sc.close();
    }
}
