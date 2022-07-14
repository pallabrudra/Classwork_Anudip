package basicprogram;
import java.util.Scanner;
public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;//for range
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ranage: ");
		n=sc.nextInt();
		/*for(int i=0;i<=n;i=i+2)
		{
			System.out.print(" "+i);
		}*/
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(" "+i);
			
		}

	}

}
