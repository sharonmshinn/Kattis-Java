import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int monthlyLimit = scanner.nextInt();
		int months = scanner.nextInt();
		int usageLeft = monthlyLimit;
		
		for (int i=0; i<months; i++) {
			int monthlyUsage = scanner.nextInt();
			if (monthlyUsage > usageLeft) {
				monthlyUsage = scanner.nextInt();
			}else{
				usageLeft -= monthlyUsage;
				usageLeft += monthlyLimit;
			}
		}
		
		System.out.println(usageLeft);

	}

}
