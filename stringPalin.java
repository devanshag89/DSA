public class stringPalin {
    public static void main(String[] args) {
        String s = "a";
        boolean b = isPalindrome(s, s.length()-1);
        System.out.println(b);
    }

    public static boolean isPalindrome(String s,int i){
        if(i==-1) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return isPalindrome(s, i-1);
    }

}
