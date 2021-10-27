//https://open.kattis.com/problems/finalexam2

import java.util.Scanner;

public class FinalExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
    //create an array for the answers written by the student on the test
		int questions = scanner.nextInt();
		String[] answers = new String[questions];
		
    //add all student answers into the array
		for (int i=0; i<questions; i++) {
			answers[i] = scanner.next();
		}
		
    //finalScore is our final output for actual correct answers
		int finalScore = 0;
    //starting at the end of the array and moving backwards, if our answers match the answer beforehand, then we will add one to our final score
		for(int i=(questions-1); i>0; i--) {
			if (answers[i].equals(answers[i-1])) {
				finalScore += 1;
			}
		}
		
    //output final score and close scanner
		System.out.println(finalScore);	
		scanner.close();
		

	}

}
