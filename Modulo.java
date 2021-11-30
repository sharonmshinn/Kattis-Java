import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] moduloNums = new int[10];
		int output = 0;
	
		for (int i=0; i<10; i++) {
			int numToModulo = scanner.nextInt();
			moduloNums[i] = numToModulo%42;
		}

		
		for (int j=0; j<10;j++) {
			int min = j;
			for (int k=j+1; k<10; k++) {
				if(moduloNums[k] < moduloNums[min]) {
					min = k;
				}
			}
			int temp = moduloNums[j];
			moduloNums[j] = moduloNums[min];
			moduloNums[min] = temp;
		}
		
		
		int counter = 1;
		for (int i = 1; i<10; i++) {
			if (moduloNums[i] != moduloNums[i-1]) {
				counter += 1;
			}
		
		}
		System.out.println(counter);

	}		
}