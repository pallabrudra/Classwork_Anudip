//wap to check a number is amstrong or not
package basicprogram;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n;
		int count=0;
		int ams=0;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		int temp=n;
		int num=temp;
		
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		while(temp!=0)
		{
			int rem=temp%10;
			ams+=Math.pow(rem,count);
			temp=temp/10;
		}
		if(ams==num)
			System.out.println(num+" is amstrong number");
		else
			System.out.println(num+" is not amstrong number");
	}

}
