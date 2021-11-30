import java.util.Scanner;

public class MissingNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] array = new int[number];
		
		for(int i=0; i<number; i++) {
			array[i] = scanner.nextInt();
		}
		
		if(array[number-1] - number != 0) {
			String output = "";
			if(array[0] != 1) {
				for(int i=1; i<array[0]; i++) {
					System.out.println(i);
			for(int j=0, k=j+1; j<number&&k<number; j++, k++) {
				if(array[k] - array[j] != 1) {
					for(int m=array[j]+1; m<array[k]; m++) {
						output += m + " ";
						}
					}
				}
			}

			String[] missedNum = output.split(" ");
			for(int i=0; i<missedNum.length; i++) {
				System.out.println(missedNum[i]);
			}
		}else {
			System.out.println("good job");
		}
		
		
		
		
		
		

		
	}

}

}
