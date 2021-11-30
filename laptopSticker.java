import java.util.Scanner;
public class laptopSticker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int wc = scanner.nextInt();
		int hc = scanner.nextInt();
		int ws = scanner.nextInt();
		int hs = scanner.nextInt();
		
		int widthLeft = wc - ws;
		int heightLeft = hc - hs;
		
		if ((widthLeft >= 2)&&(heightLeft >=2)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
