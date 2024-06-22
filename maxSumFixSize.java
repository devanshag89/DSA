public class maxSumFixSize {
    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 3;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            currSum += arr[i];
        }
        maxSum = currSum;
        for(int i=k;i<arr.length;i++){
            currSum  = currSum + arr[i]-arr[i-k];
            if(currSum > maxSum) maxSum = currSum;
        }

        System.out.println(maxSum);
    }
}
