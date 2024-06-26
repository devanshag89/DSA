package Assignments.Assignment3;

public class powerOf3 {
    public static void main(String[] args) {
        int n = 9;

        boolean b = solve(n);
        System.out.println(b);
    }

    public static boolean solve(int n) {
        if(n==1){
            return true;
        }

        if(n==0 || n%3!=0){
            return false;
        }

        return solve(n/3);
    }
}
