import java.util.*;

class quickSort{
    public static void main(String[] args) {
        int[] arr = {10,5,4,3,8,9,6};
        int pos = 0;
        int n = arr.length-1;

        quickSort(arr, pos, n);

        System.out.println(Arrays.toString(arr));
        
    }

    public static void quickSort(int[] arr,int pos,int n){
        if(pos>=n){
            return;
        }

        int in = rightIndex(arr, pos, n);
        quickSort(arr, pos, in-1);
        quickSort(arr, in+1, n);
    }

    public static int rightIndex(int[] arr,int pos,int e){

        for(int i=pos;i<e;i++){
            if(arr[i]<arr[e]){
                swap(arr,i,pos);
                pos++;
            }
        }

        swap(arr,pos,e);

        return pos;
    }

    public static void swap(int[] arr,int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}