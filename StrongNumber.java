package basicprogram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
	
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		int temp=n;
		
		while(temp>0) {
			int rem = temp%10;
			//System.out.println("rem is = "+rem);
			int fact=1;
			for(int i=1;i<=rem;i++)
				fact*=i;
			//System.out.println("Fact is ="+fact);
			sum+=fact;
			temp=temp/10;
			
		}
		//System.out.println(sum);
		if(sum==n)
			System.out.print(n+" is Strong Number");
		else
			System.out.print(n+" is not Strong Number");
	}

}
