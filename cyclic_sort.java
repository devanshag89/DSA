import java.util.*;
class Solution {
    public static void main(String[] args) {
        int[] arr = {5,4,6,2,3,1};
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                int in = arr[i]-1;
                int t = arr[i];
                arr[i] = arr[in];
                arr[in] = t;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}