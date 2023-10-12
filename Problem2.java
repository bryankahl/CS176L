import java.util.Scanner;

public class Problem2 {

	
		
		
	public static void main(String[] args) {
		int counter = 1;
		double total = 0;
		double average;
		final double MINSCORE = 0;
		final double MAXSCORE = 100;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = scan.nextLine();
		System.out.println("Hello "+name+", how many exams have you taken: ");
		double examnumber = scan.nextDouble();
		while(counter<=examnumber) {
			System.out.println("Give me the score of exam "+counter);
			double examscore = scan.nextDouble();
			if(examscore<MINSCORE||examscore>MAXSCORE) {
				System.out.println("Invalid score! Please give me the score of exam "+counter);
			}else {
				counter++;
				total+=examscore;
			}
		}
			average = total/examnumber;
			counter -= 1;
			System.out.println("Hi "+name+", your average score of "+counter+" exams is "+average);
		}
		
		

	}


