package basicprogram;
import java.util.*;
public class RelationalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks1,marks2,marks3,marks4,marks5,total;
		float avg;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the marks of 1st sub: ");
		marks1=obj.nextInt();
		System.out.println("Enter the marks of 2nd sub: ");
		marks2=obj.nextInt();
		System.out.println("Enter the marks of 3rd sub: ");
		marks3=obj.nextInt();
		System.out.println("Enter the marks of 4th sub: ");
		marks4=obj.nextInt();
		System.out.println("Enter the marks of 5th sub: ");
		marks5=obj.nextInt();
		total=marks1+marks2+marks3+marks4+marks5;
		avg=(float)total/5;
		System.out.println("Total Marks: "+total);
		System.out.println("Avg Marks: "+avg);
		if(avg>=90)
			System.out.println("Grade is: A+");
		else if(avg>=80)
			System.out.println("Grede is: A");
		else if(avg>=60)
			System.out.println("Grede is: B");
		else if(avg>=40)
			System.out.println("Grede is: C");
		else 
			System.out.println("Grede is: ");

	}

}
