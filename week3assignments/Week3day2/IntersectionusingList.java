package week3assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntersectionusingList {

	public static void main(String[] args) {
		System.out.print("a and b equal values are:");
		
	    //Declaring an array
		int[] a = new int[] {3, 2, 11, 4, 6, 7};
	
		//sorting an first array
		Arrays.sort(a);
		
		//convert array into list
		Arrays.asList(a);
		
		//Declaring  another array
		int[] b = new int[]{1, 2, 8, 4, 9, 7};
		
		//sorting an first array
		Arrays.sort(b);
		
		//convert array into list
		Arrays.asList(b);
		
		for (int i = 0; i < a.length; i++) {
		
			for (int j = 0; j < b.length; j++) {
				if (a[i]==b[j]) {
					System.out.print(b[j]+",");
									} 
				
				
			}
		}
	
		
		
		
		
		
		
		
		

	}

}
