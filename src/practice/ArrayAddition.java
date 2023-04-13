package practice;

import java.util.Arrays;

public class ArrayAddition {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int sum=Arrays.stream(arr1).sum();
		System.out.println("the addition addition is"+sum);

	}

}
