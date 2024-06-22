public class permutations {
    public static void main(String[] args) {
        String s = "abc";
        boolean[] arr = new boolean[s.length()];
        permutation(s,arr,"");
    }

    public static void permutation(String s,boolean[] arr,String ans){
        if(ans.length()==s.length()){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            if(arr[i]!=true){
                arr[i] = true;
                permutation(s, arr, ans+s.charAt(i));
                arr[i] = false;
            }
        }
    }
}
