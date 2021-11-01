//https://open.kattis.com/problems/jobexpenses

import java.util.Scanner;
public class JobExpenses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
    //input number of expenses and incomes
		int index = scanner.nextInt();
    //int variable for total amount spent to be outputted at end
		int expenses = 0;
		
    //for each input, if the number is less than 0, it is an expense
    //we will minus the negative number to our int expenses to create a positive number
		for (int i=0; i<index; i++) {
			int money = scanner.nextInt();
			if (money<0) {
				expenses -= money;
			}
		}
    //output final number of expenses
		System.out.println(expenses);
    scanner.close();
	}
}
