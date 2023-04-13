package practice;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter 3rd number");
		int num3= sc.nextInt();
		if(num1>num2)
			if(num1>num3)
				System.out.println("num1 is greater"+num1);
		if (num2>num1)
			if(num2>num3)
				System.out.println("num 2 is greatest"+num2);
		if (num3>num1)
			if(num3>num2)
				System.out.println("num 3 is greatest"+num3);
	}
}
