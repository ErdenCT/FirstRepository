
public class Hello {
			
	String model;
	String make;
	int year;
			
		Hello(String model, String make, int year) {
			this.model = model;
			this.make = make;
			this.year = year;
		}
		
		public String toString( ) {
			return model + " " + make + " " + year;
		}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello car = new Hello("Ford", "Mustang", 2021);
		
		System.out.println(car);
		
		
		System.out.println("Hello World!");
		
		
		
		
		
	}

}
