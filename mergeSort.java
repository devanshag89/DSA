import java.util.Arrays;

class Solution
{
    public static void main(String[] args) {
        int[] arr = {8,5,4,2,7,9};

        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    
    
    static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i] = arr[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i] = arr[i+m+1];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        
        while(i<n1 && j<n2){
            if(L[i]>R[j]){
                arr[k++] = R[j++];
            }
            else{
                arr[k++] = L[i++];
            }
        }
        
        while(i<n1){
            arr[k++] = L[i++];
        }
        
        while(j<n2){
            arr[k++] = R[j++];
        }
    }
    
    
    static void mergeSort(int arr[], int l, int r)
    {
        if(l>=r) return;
        
        int m = l+(r-l)/2;
        
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        
        merge(arr,l,m,r);
    }
}
