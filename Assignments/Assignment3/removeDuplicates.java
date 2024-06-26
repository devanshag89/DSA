package Assignments.Assignment3;

public class removeDuplicates{
    public static void main(String[] args) {
        String s = "geeksforgeek";

        System.out.println(solve(s,0));
    }

    public static String solve(String s,int i){
        if(s.length()==0 || i==s.length()){
            return s;
        }

        int j = i+1;

        while(j<s.length() && s.charAt(i)==s.charAt(j)){
            j++;
        }

        if(j==i+1){
            return solve(s,j);
        }
        else{
            return solve(s.substring(0, i)+s.substring(j),i-1);
        }
    }
}