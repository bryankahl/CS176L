
public class Employee {
	
	private String name;
	private double salary;
	
	public Employee() {
		name = "unknown";
		salary = 0;
	}
	
	public Employee(String employeeName, double employeeSalary) {
		name = employeeName;
		salary = employeeSalary;
	}
	public String getName() {
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public double raiseSalary(double byPercent) {
		return ((salary * 0.01 * byPercent) + salary);
	}
	

	public static void main(String[] args) {
		Employee Bryan = new Employee("Bryan Kahl", 100000);
		System.out.println(Bryan.getName());
		System.out.println(Bryan.getSalary());
		System.out.println(Bryan.raiseSalary(20));

	}

}
