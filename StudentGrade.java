
public class StudentGrade {
	
	private String name;
	private int grade;
	final int DEFAULT_GRADE = 60;
	final int MAXIMUMGRADE = 100;
	final int MINIMUMGRADE = 0;
	final int AGRADE = 90;
	final int BGRADE = 80;
	final int CGRADE = 70;
	
	public StudentGrade(String name) {
		name = "unknown";
		grade = DEFAULT_GRADE;
	}
	public StudentGrade(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	public void setGrade(int grade) {
		if(grade >= MINIMUMGRADE && grade <= MAXIMUMGRADE) {
			this.grade = grade;
			return;
		}else {
			this.grade = DEFAULT_GRADE;
		}
	}
	public int getGrade() {
		return grade;
	}
	public String getGradeLevel() {
		if(grade >= AGRADE){
			return "A";	
		}else if(grade>=BGRADE && grade < AGRADE) {
			return "B";
		}else if(grade>=CGRADE && grade < BGRADE) {
			return "C";
		}else {
			return "D";
		}
	}
	
	public static void main(String[] args) {
		//test constructors
		StudentGrade Bryan = new StudentGrade("Bryan");
		StudentGrade Joe = new StudentGrade("Joe",99);
		System.out.println(Bryan.getGrade());
		System.out.println(Joe.getGrade());
		//test setGrade
		Bryan.setGrade(-100);
		System.out.println(Bryan.getGrade());
		Bryan.setGrade(1000);
		System.out.println(Bryan.getGrade());
		Bryan.setGrade(88);
		System.out.println(Bryan.getGrade());
		//test getGradeLevel
		System.out.println(Joe.getGradeLevel());
		System.out.println(Bryan.getGradeLevel());
		Bryan.setGrade(77);
		System.out.println(Bryan.getGradeLevel());
		Bryan.setGrade(54);
		System.out.println(Bryan.getGradeLevel());
		

	}

}
