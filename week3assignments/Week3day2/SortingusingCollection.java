package week3assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SortingusingCollection {

	public static void main(String[] args) {
//Declare a String array
		List<String> list = new ArrayList<String>();
//Add the values
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
// printing the unsorted ArrayList  
		System.out.println(list);
// Sorting ArrayList in ascending Order   
		Collections.sort(list);   
		//list.sort(String.CASE_INSENSITIVE_ORDER);
//printing the sorted ArrayList
		System.out.println(list);
		
//Iterating the values in reverse order
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}

}
