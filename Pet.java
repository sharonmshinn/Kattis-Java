import java.util.Scanner;
public class Pet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int highestScore = 0;
		int winner = 0;
		
		
		for (int i=1; i<6; i++) {
			int total = 0;
			int playerNum = 0;
			for(int k=0; k<4; k++) {
				total += scanner.nextInt();
			}
			if(total > highestScore) {
				highestScore = total;
				winner = i;
			}
		}
		System.out.print(winner + " " + highestScore);

	}

}
