public class maxSubstring {
    public static void main(String[] args) {
        String s = "cadbzabcd";
        int l = solve(s);
        System.out.println(l);
    }
    // brute force implementation
    public static int getLength(String s) {
        int l = 0;
        int[] arr = new int[256];
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(arr[s.charAt(j)]==1) break;
                l = Math.max(l,j-i+1);
                arr[s.charAt(j)]=1;
            }
        }
        return l;
    }
    // optimal implementation
    public static int solve(String s){
        int ei = 0;
        int si = 0;
        int[] arr = new int[256];
        int l = 0;
        while(ei<s.length()){
            int in = s.charAt(ei);
            arr[in]++;

            while(si<=ei && arr[in]!=1){
                arr[s.charAt(si)]--;
                si++;
            }

            l = Math.max(l,ei-si+1);
            ei++;
        }
        return l;
    }

}
