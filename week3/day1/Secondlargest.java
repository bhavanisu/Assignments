package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Secondlargest {
	public static void main(String[] args) {
		//n array {3, 2, 11, 4, 6, 7
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		System.out.println(arr);
        Collections.sort(arr);
   System.out.println(arr);
   Integer max = Collections.max(arr);
System.out.println(max);
 arr.remove(arr.size()-1);
Integer max2 = Collections.max(arr);
System.out.println(max2);


	}

}
