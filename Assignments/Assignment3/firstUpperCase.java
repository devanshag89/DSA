package Assignments.Assignment3;
import java.util.*;
public class firstUpperCase {
    public static void main(String[] args) {
        String s = "addercdKfgd";
    }

    public static char solve(String s,int i){
        if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        if(i==s.length()){
            return 0;
        }

        return solve(s,i+1);
    }
}
