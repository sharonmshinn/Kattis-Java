import java.util.Scanner;
import java.util.Arrays;
public class SavingPrincessPeach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int obstacleTotal = scanner.nextInt();
		int obstacleFound = scanner.nextInt();
		
		int[] obstacles = new int[obstacleFound];
		
		for(int i=0; i<obstacleFound; i++) {
			obstacles[i] = scanner.nextInt();
		}
		
		for(int j=0; j<obstacleFound; j++) {
			int min = j;
			for(int k=j+1; k<obstacleFound; k++) {
				if(obstacles[k] < obstacles[min]){{
					min = k;
				}
			}
			int temp = obstacles[j];
			obstacles[j] = obstacles[min];
			obstacles[min] = temp;
		}
		
			for(int k=0; k<obstacleFound; k++) {
				System.out.println(obstacles[k]);
			}
		
		if(obstacleFound == 0) {
			System.out.println("A: ");
			for(int i=0; i<obstacleTotal; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("B: ");
		//Special case: first index
		if(obstacles[0]>0) {
			System.out.println("C: ");
			for(int k=0; k<obstacles[0]; k++) {
				System.out.println(k);
			}
			for(int i=0; i<obstacleFound-1; i++) {
				if(obstacles[i+1] - obstacles[i] != 1) {
					for(int l=obstacles[i]+1; l<obstacles[i+1]; l++) {
						System.out.println(l);
					}
				}
			}
		}else if(obstacles[0] == 0) {
			System.out.println("D: ");
			for(int i=0; i<obstacleFound-1; i++) {
				if(obstacles[i+1] - obstacles[i] != 1) {
					for(int m=obstacles[i]+1; m<obstacles[i+1]; m++) {
						System.out.println(m);
					}
				}
			}
		}
		//Special case: last index
		if(obstacles[obstacleFound-1] < obstacleTotal-1) {
			System.out.println("E: ");
			for(int i=obstacles[obstacleFound-1]+1; i<obstacleTotal; i++) {
				System.out.println(i);
			}
		}
	}
		System.out.println("Mario got " + obstacleFound + " of the dangerous obstacles.");

	}
}
}


