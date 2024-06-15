package Assignments.Assignment1;

import java.util.Scanner;

public class sumOfThree {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
		    int a = sc.nextInt();
		    if((a-3)%3!=0 && (a-3)!=1 && (a-3)!=2 && (a-3)>0){
		        System.out.println("YES");
		        System.out.println(1+" "+2+" "+(a-3));
		    }
		    else if((a-5)%3!=0 && (a-5)!=1 && (a-5)!=4 && (a-5)>0){
		        System.out.println("YES");
		        System.out.println(1+" "+4+" "+(a-5));
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		
		sc.close();
	}

}
