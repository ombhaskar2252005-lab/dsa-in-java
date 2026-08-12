public class array {
    public static void main(String args[]){
        int arr[] = {2,8,10,7,9};
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            ans=Math.max(ans,arr[i]);
        }
        System.out.println(ans);
    }
}
