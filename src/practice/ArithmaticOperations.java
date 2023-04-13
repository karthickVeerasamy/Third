package practice;
import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("the addition of two numbers is "+num1+"+"
				+num2+"="+(num1+num2));
		System.out.println("the subtracion of two numbers is "+num1+"-"
				+num2+"="+(num1-num2));
		System.out.println("the multiplication of two numbers is "+num1+"*"
				+num2+"="+(num1*num2));
		System.out.println("the division of two numbers is "+num1+"/"+num2+
				"="+(num1/num2));
		System.out.println("the remainder of two number is"+num1+"%"+num2+"="+
				(num1%num2));
	}

}
