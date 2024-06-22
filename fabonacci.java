public class fabonacci {
    public static void main(String[] args) {
        int n = 5;
        int ans = fabonacci(n);
        System.out.println(ans);
    }

    public static int fabonacci(int n) {
        if(n==0 || n==1) return n;
        return fabonacci(n-1)+fabonacci(n-2);
    }
}
