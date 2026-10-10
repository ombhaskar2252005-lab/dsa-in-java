import java.util.*;
public class arraysort {
    static void sortColors(int[] nums) {
        int l =0;
        int m =0;
        int h = nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                int temp = nums[m];
                nums[m]=nums[l];
                nums[l]=temp;
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int temp=nums[m];
                nums[m]=nums[h];
                nums[h]=temp;
                h--;
            }
        }
        // input me 1 0 2 0 1 2 dena
        System.out.println("Sorted array is: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array: ");
        for(int i =0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        sortColors(nums);
    }
}

