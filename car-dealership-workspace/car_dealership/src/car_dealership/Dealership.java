package car_dealership;

/*
 * Write a program to simulate a car dealership sales process. We'll have employees, working selling vehicles to customers 
 * */

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St. ");
		cust1.setCashOnHand(22000);
		
		Vehicle car1 = new Vehicle("Subaru", "Forrester", 20000);

		Employee emp1 = new Employee();
		emp1.setName("Maggie");
		
		
		cust1.purchaseCar(car1, emp1, false);
		
		Vehicle vehicle = new Vehicle("BMW", "M3", 20000);
		
		Vehicle car2 = new Vehicle("BMW", "M3", 20000);
		
		boolean value = car2.equals(vehicle);
		System.out.println(value); 
		
		// this is "true" due to the the override equals methods in Vehicle to check the value
		// override method allow us to check the data between the two objects
		/*
		 * 
		 * handleCustomer( Customer cust, boolean finance, Vehicle vehicle)
		 * 
		 * if(finance == true)
		 * 		runCreditHistory(Customer cust, double doubleAmount)
		 * else if (vehicle.getPrice() <= cust.getCashOnHand):
		 * 		processTransaction(Customer cust, Vehicle vehicle) 
		 * else if:
		 * 		tell customer to bring more money
		 * */		
	}

}
