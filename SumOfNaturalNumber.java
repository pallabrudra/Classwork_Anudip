package basicprogram;
import java.util.*;
//wap to calculate sum of n natural numbers
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int range,i,sum=0;
		Scanner sc=new Scanner(System.in); //createing object of scanner class
		System.out.println("enter the range: ");
		range=sc.nextInt();
		
		for(i=1;i<=range;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of "+range+" natural number: "+sum);

	}

}
