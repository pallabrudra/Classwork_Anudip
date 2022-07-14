package basicprogram;

import java.util.Scanner;

public class CountNumberOfOdd {
	public static void main(String[] args) {
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		n=sc.nextInt(); 
		
		for(int i=1;i<=n;i=i+2)
		{
				count++;
		}
			
		System.out.println("\nNumber odd between 1 to "+n+" is: "+count);
	

}


}
