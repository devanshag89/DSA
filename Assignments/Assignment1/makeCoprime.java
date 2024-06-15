package Assignments.Assignment1;

class Solution{
    int countCoPrime(int a[], int n)
    {
        int c = 0;
        for(int i=0;i<n-1;i++){
            if(gcd(a[i],a[i+1])!=1) c++;
        }
        return c;
    }
    
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}