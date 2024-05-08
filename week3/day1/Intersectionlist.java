package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class Intersectionlist {
public static void main(String[] args) {
	//int[] num = {3,2,11,4,6,7};
	//int [] num2= {1,2,8,4,9,7};
	List<Integer> arr1 = new ArrayList<Integer>();
	arr1.add(3);
	arr1.add(2);
	arr1.add(11);
	arr1.add(4);
	arr1.add(6);
	arr1.add(7);
	System.out.println(arr1);
	List<Integer> arr2 = new ArrayList<Integer>();
	arr2.add(1);
	arr2.add(2);
	arr2.add(8);
	arr2.add(4);
	arr2.add(9);
	arr2.add(7);
	System.out.println(arr2); 
	for (int i = 0; i < arr1.size(); i++) 
	{
		System.out.println(arr1.get(i));
	}
 	for (int i = 0; i < arr2.size(); i++) 
	{
		System.out.println(arr2.get(i));
	}
	
 	if (arr1.equals(arr2)==true)
 	{
 		System.out.println("both are equal");
 	}
 	else
 	{
 		System.out.println("both are not equal");
 	}
	
	
}
}
