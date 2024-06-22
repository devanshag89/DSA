import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {8,4,1,5,9,2};

        for(int i=1;i<arr.length;i++) {
            int in = i;
            while(in>0 && arr[in-1]>arr[in]){
                swap(arr,in,in-1);
                in--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
