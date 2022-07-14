
package basicprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int num,i,fact=1;
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the range: ");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is "+fact);


	}

}
