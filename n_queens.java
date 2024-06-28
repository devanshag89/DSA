import java.util.*;

public class n_queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int a = solve(arr,n,n-1,0);

        System.out.println(a);

        sc.close();
    }

    public static int solve(int[][] arr,int n,int t,int r){

        if(t==0) return 1;
        if(r==n) return 0;
        int a = 0;
        for(int c=0;c<n;c++){
            if(isValid(arr,r,c,n)){
                arr[r][c] = 1;
                a = a+solve(arr,n,t-1,r+1);
                arr[r][c] = 0;
            }
        }

        a = a+solve(arr,n,t,r+1);
        return a;
    }

    public static boolean isValid(int[][] arr, int row,int col,int n){
        int r = row;
        int c = col;

        while(r>=0){
            if(arr[r][c] == 1) return false;
            r--;
        }


        r = row;

        while(r>=0 && c>=0){
            if(arr[r][c] == 1) return false;
            r--;
            c--;
        }

        r = row;
        c = col;

        while(r>=0 && c<n){
            if(arr[r][c] == 1) return false;
            r--;
            c++;
        }

        return true;
    }
}
