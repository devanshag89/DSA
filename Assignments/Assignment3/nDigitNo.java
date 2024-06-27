package Assignments.Assignment3;
import java.util.*;
class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> ans = increasingNumbers(2);

        System.out.println(ans);
    }
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(n==1) ans.add(0);
        
        solve(n,ans,1,0);
        
        return ans;
    }
    
    public static void solve(int n,ArrayList<Integer> ans,int j,int num){
        if(n==0){
            ans.add(num);
            return;
        }
        
        for(int i=j;i<=9;i++){
            int t = num*10+i;
            solve(n-1,ans,i+1,t);
        }
    }
}

