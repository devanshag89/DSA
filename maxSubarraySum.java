public class maxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            int s = 0;
            for(int j=i;j<arr.length;j++) {
                s=s+arr[j];
                if(s>max) max=s;
            }
        }
        System.out.println(max);
    }
}
