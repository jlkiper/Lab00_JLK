
public class Application {

	public static void main(String[] args) {
		
		System.out.println("This application is working.");
		
		Circle c = new Circle();
		
		System.out.println(c.toString());
		System.out.println(c.calculateArea());
		
		Circle c2 = new Circle(5.6);
		
		System.out.println(c2.toString());
		System.out.println(c2.calculateArea());
		
		Circle c3 = new Circle(.8);
		
		System.out.println(c3.toString());
		System.out.println(c3.calculateArea());
		
	}//end main

}//end class
