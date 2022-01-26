import java.util.Scanner;
public class ratingProblems {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float possibleMin = 0;
		float possibleMax = 0;
		int scoreSoFar = 0;
		
		
		int totalJudges = scanner.nextInt();
		int judgesJudged = scanner.nextInt();
		
		for (int i=0; i<judgesJudged; i++) {
			scoreSoFar += scanner.nextInt();
		}
		
		possibleMin += (-3*(totalJudges - judgesJudged));
		possibleMax += (3*(totalJudges - judgesJudged));
		possibleMin += scoreSoFar;
		possibleMax += scoreSoFar;
		possibleMin = (possibleMin/totalJudges);
		possibleMax = (possibleMax/totalJudges);
		
		System.out.println(possibleMin + " " + possibleMax);
		

	}

}
