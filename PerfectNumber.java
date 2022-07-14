package basicprogram;
import java.util.*;
// Write a program to check a number is perfect or not
public class PerfectNumber {

	public static void main(String[] args) {
		int num;//declare a variable num
		int sum=0;//initilalize sum variable as 0
		Scanner sc=new Scanner(System.in);//createing object of scanner class
		System.out.println("Enter the number: ");
		num=sc.nextInt();//take input from user
		//for loop
		for(int i=1;i<num;i++)//i is counter variable
		{
			if(num%i==0)//find the divissior
				sum=sum+i;//sum those divisior
		}//end of loop
		if(num==sum)//check sum value and previously taken numbers are equal or not
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is a not a perfect number");
	}

}
