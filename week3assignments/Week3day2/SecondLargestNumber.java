package week3assignments;

import java.util.Arrays;
import java.util.Iterator;

public class SecondLargestNumber {

	public static void main(String[] args) {
		System.out.print("Ascending order=");
		//Declare an  array elements
		int a[] = {3, 2, 11, 4, 6, 7};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			
			System.out.print("["+a[i]+"]");	
			
		}
		int j=a.length-2;
		System.out.print("\nThe Second Largest Number:");
		System.out.print(a[j]);

		
	}

}
