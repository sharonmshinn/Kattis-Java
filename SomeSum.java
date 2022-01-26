import java.util.Scanner;
public class SomeSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		if(n%4 == 2) {
			System.out.println("Odd");
		}else if(n%4 == 0){
			System.out.println("Even");
		}else {
			System.out.println("Either");
		}
	}

}
