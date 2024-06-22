public class subsequences {
    public static void main(String[] args) {
        String s = "abc";
        subsequences(s,0,"");
    }

    public static void subsequences(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }

        subsequences(s,i+1,ans+s.charAt(i));
        subsequences(s,i+1,ans);
    }
}
