package com.testing.test;

public class Calculator {

	public int addition(int a, int b)
	{
		return a+b;
	}
	
	public int factorial(int n)
	{
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}
	
	public void additionWithException(int a, int b)
	{
			int c=a/b;
			System.out.println(c);
	}
	public int addTwoNegativeNo(int a,int b)
	{
		return a+b;
	}
	public int addTwoPosetiveNo(int a,int b)
	{
		return a+b;
	}
	public int multiple(int a,int b)
	{
		return a*b;
	}
	public int findMax(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			} // end of if
		}// end of loop
		return max;
	}//end of method
}
