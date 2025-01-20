package week3assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementusingList {

	public static void main(String[] args) {
	char [] a ={1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(a);
		int n = 0;
		n=a.length;
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(+a[i] +" ");
			}
		boolean ischeck;
		int M;
		System.out.print("\nMissing Numbers:");
		for(int i = 0;i<n;i++)
			if(a[i]==i+1)
			{
				ischeck=true;
				continue;
			}
			else
			{
				ischeck=false;
				M=a[i];
				M=M-1;
				System.out.print(+M +" ");
				continue;
	}
	}

}

	
	
		
	
	
