package week3.day1;

public class Concreteclass implements DatabaseConnection{

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connection is done");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("connectionis disconnect");
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("execute the update in connection");
		
	}
	public static void main(String[] args) {
		Concreteclass c = new Concreteclass();
		c.connect();
		c.disconnect();
		c.executeUpdate();
	}

}
