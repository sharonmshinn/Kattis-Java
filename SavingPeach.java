
import java.util.Scanner;

public class SavingPeach {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int obstacleTotal = scanner.nextInt();
		int obstacleFound = scanner.nextInt();
		
		int[] obstacles = new int[obstacleFound];
		
		
		//import data
		for(int i=0; i<obstacleFound; i++) {
			obstacles[i] = scanner.nextInt();
		}
		
		//sort array
		for(int j=0; j<obstacleFound-1; j++) {
			int min = j;
			for(int k=j; k<obstacleFound; k++) {
				if(obstacles[k] < obstacles[min]) {
					min = k;
				}
			}
			int temp = obstacles[j];
			obstacles[j] = obstacles[min];
			obstacles[min] = temp;
		}
		
		//take out duplicates
		int output = obstacleFound;
		for(int i=0; i<obstacleFound; i++) {
			for(int j=i+1; j<obstacleFound; j++) {
				if(obstacles[i] == obstacles[j]) {
					output -= 1;
					i = j;
				}
			}
		}

			
		
		//special case: if no obstacles are found
		if(obstacleFound == 0) {
			
			for(int i=0; i<obstacleTotal; i++) {
				System.out.println(i);
			}
		}else {
			
		//Special case: first index
		if(obstacles[0]>0) {
			
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
			
			for(int i=obstacles[obstacleFound-1]+1; i<obstacleTotal; i++) {
				System.out.println(i);
			}
		}
	}
		System.out.println("Mario got " + output + " of the dangerous obstacles.");
	}

	}


