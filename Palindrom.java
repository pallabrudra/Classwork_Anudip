package basicprogram;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args)
	{
		int num;//take variable num
		int rev=0;//initialize rev as 0
		int reminder;//take variable reminder to store reminder
		Scanner sc=new Scanner(System.in);//creating the object of Scanner class
		System.out.println("Enter the number: ");
		num=sc.nextInt();//take input from users
		int temp=num;// store the value of num in temp for future use
		//while loop
		while(num!=0)//iterate untill num become 0
		{
			reminder=num%10;//for reminder
			rev=rev*10+reminder;//reverse logic
			num=num/10;
		}
		if(rev==temp)
			System.out.println(temp+" is a palindrom");
		else
			System.out.println(temp+" is not palindrom");
	}

}
