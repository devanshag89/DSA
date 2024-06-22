import java.util.*;

public class maxPointsCards {
    public static void main(String[] args) {
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        int ans = getMaxPoints(arr,k);
        System.out.println(ans);
    }

    public static int getMaxPoints(int[] arr,int k){
        int lSum = 0;
        int rSum = 0;
        for(int i=0;i<k;i++){
            lSum += arr[i];
        }
        int in = arr.length-1;
        int mSum = lSum;
        for(int i=k-1;i>=0;i--){
            lSum = lSum - arr[i];
            rSum = rSum + arr[in];
            in--;
            mSum = Math.max(mSum, lSum+rSum);
        }
        return mSum;
    }
}