import java.util.*;
public class selection{
    public static void selectionsort(int[] nums){
        int n = nums.length;
        for(int i =0; i<n-1; i++){
            int min =i;
            for(int j = i+1; j<n; j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min]=nums[i];
            nums[i] = temp;
        }
        for(int i =0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        selectionsort(nums);
    }
}