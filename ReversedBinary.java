import java.util.Scanner;

public class ReversedBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int decimal = scanner.nextInt();
		
		String binary = Integer.toBinaryString(decimal);

		String[] split = binary.split("");
		int[] revBinary = new int[split.length];
		for (int i=0; i<split.length; i++) {
			revBinary[i] = Integer.parseInt(split[i]);
		}
	
		int output = 0;
		for(int i=0; i<revBinary.length; i++) {
			if (revBinary[i] == 1) {
				output += Math.pow(2, i);
			}
		}
		System.out.println(output);
		
	}
}
