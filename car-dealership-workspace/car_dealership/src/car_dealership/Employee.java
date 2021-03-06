package car_dealership;

public class Employee {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void runCreditHistory(Customer customer, double doubleAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase the vehicle");
		System.out.println("Customer " + customer.getName() + "'s loan is $" + String.format("%.2f", doubleAmount));
	}
	
	
	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println(customer.getName() + " may purchase " + vehicle + " for the price $" + String.format("%.2f",vehicle.getPrice()));		
	}
	
	
	public void handleCustomer (Customer customer, boolean finance, Vehicle vehicle) {
		
		if (finance) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		} else if (vehicle.getPrice() <= customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		} else {
			System.out.println("Tell " + customer.getName() + " to bring more money to purchase the vehicle.");
		}
	}

}
