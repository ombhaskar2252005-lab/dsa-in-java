// import java.util.*;
public class sparsemt1 {
    public static void main(String[] args) {
       int nums[][] = {
        {2,0,0,0,0},
        {0,0,3,0,0},
        {0,0,0,0,0},
        {0,0,0,7,0},
        {0,6,0,0,0}
       };
       int cnt =0;
       for(int[] mat : nums){
        for(int ele : mat){
            if(ele!=0){
                cnt++;
            }
        }
       }
       int smr[][] = new int[3][cnt];
       int k =0;
       for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums[0].length; j++){
            if(nums[i][j] !=0){
                smr[0][k] = i;
                smr[1][k] = j;
                smr[2][k] = nums[i][j];
                k++;
            }
        }
       }
       for(int i=0; i<cnt; i++){
        System.out.println("row --> " + smr[0][i]);
        System.out.println("col --> " + smr[1][i]);
        System.out.println("ele --> " +smr[2][i]);
        System.out.println("****************");
       }
    }
}
