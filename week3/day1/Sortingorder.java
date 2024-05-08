package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortingorder {
public static void main(String[] args) {
	//{HCL, Wipro, Aspire Systems, CTS
	List<String> sort = new ArrayList<String>();
	sort.add("HCL");
	sort.add("Wipro");
	sort.add("Aspire Sysutems");
	sort.add("CTS");
	//System.out.println(sort);
	Collections.sort(sort);
	System.out.println(sort);
//Collections.reverse(sort);
//System.out.println(sort);
for (int i = 3; i >= 0; i--) 
	{
	     String string = sort.get(i);	
		System.out.println(string);
		
	}
	
	
	
}}
