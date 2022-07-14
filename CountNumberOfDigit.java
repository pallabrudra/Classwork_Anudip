
//Program to count the number of digits
package basicprogram;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		int temp=num;
		for(;num!=0;)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in"+temp+" is: "+count);
	}

}
