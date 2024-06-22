import java.util.*;

public class maxSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = 5;
        int s = 12;
        int a = 0;
        int i = 0;
        int p = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<n){
            a = a+arr[i];

            while(a>s) {
                a = a-arr[p];
                p++;
            }
            if(a==s && p<=i){
                list.add(p+1);
                list.add(i+1);
                return list;
            }
            i++;
        }
        list.add(-1);
        return list;

    }
}
