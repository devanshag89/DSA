public class headTale {
    public static void main(String[] args) {
        int n = 3;
        combinations(n,"");
    }

    public static void combinations(int n,String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }

        combinations(n-1,ans+"H");
        combinations(n-1, ans+"T");
    }
}
