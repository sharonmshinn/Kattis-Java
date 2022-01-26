import java.util.Scanner;

public class NoDuplicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] words = scanner.nextLine().split(" ");
		
		String output = "yes";
		for(int i=0; i<words.length; i++) {
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					output = "no";
				}
			}
		}
		System.out.println(output);
		
	}
}