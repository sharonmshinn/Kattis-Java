import java.util.Scanner;
public class quadrantSelection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double xCord = scanner.nextDouble();
		double yCord = scanner.nextDouble();
		if ((xCord>0) && (yCord>0)) {
			System.out.println("1");
		}else if ((xCord<0) && (yCord>0)) {
			System.out.println("2");
		}else if ((xCord<0) && (yCord<0)) {
			System.out.println("3");
		}else{
			System.out.println("4");
		}
	}

}
