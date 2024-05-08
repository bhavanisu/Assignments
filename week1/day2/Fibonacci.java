package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		int n= 8;
	int	firstterm =0; 
		int secondterm=1;
		
	for(int i=1;i<=n;i++)
	{
	  System.out.println(firstterm + "");
	   int	nextterm= firstterm+secondterm;
	   firstterm=secondterm;
	   secondterm=nextterm;
	   
	}
	}

}
