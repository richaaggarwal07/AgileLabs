import java.util.Scanner;
public class min_of_10_no {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 10 numbers"); 
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		int small = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i];
			}
		}
		System.out.println("the smallest number is "+ small);
		
	}
}
