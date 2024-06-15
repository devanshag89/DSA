package Assignments.Assignment1;

class Solution {
    public int reverse(int x) {
        long max = Integer.MAX_VALUE;
        long min = Integer.MIN_VALUE;
        if(reverse1(x)>=min && reverse1(x)<=max) return (int)reverse1(x);
        return 0;
    }

    public long reverse1(int x){
        boolean b = false;
        if(x<0){
            b = true;
            x = -x;
        }
        long s = 0;
        while(x>0){
            int r = x%10;
            s = s*10+r;
            x = x/10;
        }
        if(b) return -s;
        return s;
    }
}