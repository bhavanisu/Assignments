package week2.day4;

public class calculator {
	
		
		public void add(int a, int b)
		{System.out.println("addition of two numbers:" +(a+b)	);
		
		}
		public void add (int a, int b, int c)
		{
			System.out.println("addition of three numbers is :" +(a+b+c));
			
		}
		public void multiple(double a, double b)
		{
			System.out.println("multiple of two double numbers:" +(a*b));
		}
		
		public void multiple(float a, float b)
		{
			System.out.println("multiple of two float numbers:" +(a*b));
		}
		
		public static void main(String[] args) {
			calculator addition= new calculator();
			calculator mult = new calculator();
			addition.add(2, 3);
			addition.add(5, 8, 2);
			mult.multiple(2525, 25687);
			mult.multiple(12.5, 18.2);
			
			
			
		}
			
		
	}

