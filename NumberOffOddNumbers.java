/* 
 @Author Nilanjan Dasgupta
 */
package basicprogram;
import java.util.*;
//wap to count no of odd number from 1 to n
public class NumberOffOddNumbers {

	public static void main(String[] args) {
		int n;//declare a variable n for range
		int count=0;//counter variable
		Scanner sc=new Scanner(System.in);// creating object of Scanner class
		System.out.println("Enter the Range: ");
		n=sc.nextInt();//take input from user and store the value in the variable 
		//for loop 
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)//check for odd number
			{
				System.out.print(" "+i);// print the odd numbers
				count++;//count number of odd numbers with in a range
		}
			}
		System.out.println("\nNumber odd between 1 to "+n+" is: "+count);//output
	}

}
