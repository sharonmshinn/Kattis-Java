import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int timesPressed = scanner.nextInt();
		int index = -1;
		int finalTime = 0;
		int[] secondsPressed = new int[timesPressed];
		
		for (int i=0; i<timesPressed;i++) {
			secondsPressed[i] = scanner.nextInt();
		}
		
		for (int i=0; i<timesPressed;i++) {
			if (i%2 == 0) {
				finalTime += secondsPressed[i];
			}else {
				finalTime -= secondsPressed[i];
			}
			index += 1;
		}
		
		if (index%2 == 0) {
			System.out.println("still running");
		}else {
			System.out.println(Math.abs(finalTime));
		}
	}
}

