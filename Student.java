import java.util.Scanner;

public class Student {
	
	String name;
	int totalScore;
	int averageScore;

	public Student() {
		name = "unknown";
		totalScore = 0;
		averageScore = 0;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return totalScore;
	}
	public double getAverage() {
		return averageScore;
	}
	public void setName(String Bryan) {
		name = Bryan;
	}
	public void setScore(int addScore) {
		totalScore = totalScore + addScore;
	}	
	public void setAverage() {
		averageScore = totalScore / 5;
	}
	
		
		
	
	
	
	
				
	
	
	public static void main(String[] args) {
		Student bryan = new Student();
		bryan.setName("Bryan");
		bryan.getName();
		System.out.println(bryan.getName());
		bryan.setScore(100);
		bryan.setScore(50);
		bryan.setScore(20);
		bryan.setScore(40);
		bryan.setScore(90);
		bryan.getScore();
		System.out.println(bryan.getScore());
		bryan.setAverage();
		bryan.getAverage();
		System.out.println(bryan.getAverage());
		
	
	}
	

}