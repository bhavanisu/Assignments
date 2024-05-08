package week3.day2;

public class Breakoutconstrucor {
	
	int rollno;
	String name;
	
	public Breakoutconstrucor() {
		System.out.println("no students in the class");
		}
	
	public Breakoutconstrucor(int rollno)
	{
	this();
		this.rollno=rollno;
		
		System.out.println("roll numbe of one student:" +rollno);
	}
	
	public Breakoutconstrucor(int rollno,String name)
	{ this(4);
		this.rollno=rollno;
		this.name=name;
		System.out.println("rollno and name of the student:"  +rollno +" " +name);
	}
	
	public static void main(String[] args) {
		Breakoutconstrucor c= new Breakoutconstrucor(5,"rahul");
	}
}
