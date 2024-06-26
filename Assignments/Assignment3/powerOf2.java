package Assignments.Assignment3;

public class powerOf2 {
    public static void main(String[] args) {
        int n = 6;

        boolean b = solve(n);
        System.out.println(b);
    }

    public static boolean solve(int n) {
        if(n==1){
            return true;
        }

        if(n==0 || n%2!=0){
            return false;
        }

        return solve(n/2);
    }
}
