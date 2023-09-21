
public class UniversityClass {
	
	private String enterName;
	private int totalClasses;
	
	public UniversityClass(String[] args) {
		
		enterName = "unknown";
		totalClasses = 0;
		
		

	}
	
	public UniversityClass(String enterName, int totalClasses) {
		this.enterName = enterName;
		this.totalClasses = totalClasses;
		
		
	}
	
	public String getName() {
		return enterName;
	}
	public void setName(String enterName) {
		this.enterName = enterName;
	}
	public int getTotalClasses() {
		return totalClasses;
	}
	public void setTotalClasses() {
		this.totalClasses = totalClasses;
	}
	public static void main(String args[]) {
		UniversityClass it=new UniversityClass("Bryan", 5);
		System.out.println("Name: ");
		System.out.println(it.getName());
		System.out.println("Number of classes: ");
		System.out.println(it.getTotalClasses());
		
	}
	
	
}
