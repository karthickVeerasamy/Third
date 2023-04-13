package practice;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[]arr=new int[] {1,1,5,8,6,8};
		System.out.println("duplicate numbers in given array");
	for(int i=0;i<=arr.length;i++)	{
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}

	}

}
