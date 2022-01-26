import java.util.Scanner;
public class ShoppingList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int lists = scanner.nextInt();
		int items = scanner.nextInt();
		
		int counter = 0;
		
		String[] allItems = new String[lists*items];
		
		for(int i=0; i<lists*items; i++) {
			allItems[i] = scanner.next();
		}
		
		String output = "";
		for(int i=0; i<items; i++) {
			int itemCount = 0;
			for(int m=0; m<items*lists; m++) {
				if(allItems[i].equals(allItems[m])) {
					itemCount += 1;
				}
			}
			if(itemCount == lists) {
				counter += 1;
				output += allItems[i] + " ";
			}
			
		}
		
		String[] split = output.split(" ");
		
		for(int j=0; j<split.length;j++) {
			int min = j;
			for(int k=j+1; k<split.length; k++) {
				if(split[k].compareTo(split[min]) < 0){
					min = k;
				}
			}
			String temp = split[j];
			split[j] = split[min];
			split[min] = temp;
		}
		
		
		System.out.println(counter);
		for(int i=0; i<split.length; i++) {
			System.out.println(split[i]);
		
		}
	}

}
