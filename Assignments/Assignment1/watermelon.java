package Assignments.Assignment1;

import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>2 && n%2==0){
		    System.out.print("YES");
		}
		else{
		    System.out.print("NO");
		}
		
		sc.close();
	}

}
