package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missingelement {
public static void main(String[] args) {
	//{1, 2, 3, 4, 10, 6, 8
	
	List<Integer> arr= new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(10);
	arr.add(6);
	arr.add(8);
	//System.out.println(arr);
	Collections.sort(arr);
	System.out.println(arr);
	for (int i = 0; i < arr.size(); i++) 
	{
		System.out.println(arr.get(i));
	}
	
	
}
}
