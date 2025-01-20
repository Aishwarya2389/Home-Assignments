package week1assignments;
import java.util.Arrays;
public class Palindrome {

	public static void main(String[] args) {
	int p,input,output=0;
	int num=121;
	input=num;
	while(num>0) {
		p=num%10;
		output=(output*10)+p;
		num=num/10;
	}
  if (input==output) 
  {
	  System.out.println("It is a palindrome ");
} 
  else 
{
	System.out.println("It is not a palindrome");
}
		
	}
	  
	 
	
}
	


