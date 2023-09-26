
public class Car {
	private double efficiency;
	private double fuel;
	private double distance;
	
	public Car() {
		efficiency = 0;
		distance = 0;
		fuel = 0;
	}
	public Car(double fuelEfficiency) {
		efficiency = fuelEfficiency;
	}
	public double addGas(double gas) {
		return fuel = fuel + gas;
	}
	public void setGas(double fuel) {
		this.fuel = addGas(fuel);
	}
	public double drive(double miles) {
		return distance = (efficiency * fuel) - miles;
	}
	public void setDrive(double distance) {
		this.distance = drive(distance);
	}
	public double getGasInTank() {
		return distance / efficiency;
	}
	public static void main(String[] args) {
		Car myVehicle = new Car(50);
		myVehicle.addGas(20);
		myVehicle.drive(100);
		System.out.println(myVehicle.getGasInTank() + " gallons left");
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private int fuel;
	private int distance;
	private int fuelEconomy;
	private int efficiency;
	
	public Car(){
		fuel = 0;
		distance = 0;
		efficiency = 0;
	}
	public Car(fuelEfficiency) {
		fuelEfficiency = efficiency;
	}
	
	public Car(int addFuel, int drive) {
		fuel = addFuel;
		distance = drive;
	}
	public Car(int i) {
		// TODO Auto-generated constructor stub
	}

	public int addGas() {
		return fuel;
	}
	public int drive() {
		return distance;
	}
	public static void main(String[] args) {
		Car myHyrbid = new Car(50);

	}

}
*/