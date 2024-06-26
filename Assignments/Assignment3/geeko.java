package Assignments.Assignment3;

import java.util.*;

class geekonacci {
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int q = sc.nextInt();
		    System.out.println(solve(a,b,c,q));
		}
	}
	
	public static int solve(int a,int b,int c,int n){
	   // if(n==0) return a;
	   // if(n==1) return b;
	   // if(n==2) return c;
	    
	    int arr[] = new int[n+1];
	    
	    arr[0] = a;
	    arr[1] = b;
	    arr[2] = c;
	    
	    for(int i=3;i<=n;i++){
	        arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
	    }
	    
	    return arr[n-1];
	}
}
