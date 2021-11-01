//https://open.kattis.com/problems/fizzbuzz

import java.util.Scanner;
public class fizzbuzz {

	public static void main(String[] args) {
  //input three numbers with scanner
		Scanner scanner = new Scanner(System.in);
    //prints fizz when divisible by first input
		int fizzNum = scanner.nextInt();
    //prints buzz when divisible by second input
		int buzzNum = scanner.nextInt();
    //number to count until starting at 1 (1,... ,countNum)
		int countNum = scanner.nextInt();
		
		for (int i=1; i<countNum+1;i++) {
			if((i%fizzNum == 0) && (i%buzzNum != 0)) {
				System.out.println("Fizz");	
			}else if((i%buzzNum == 0) && (i%fizzNum != 0)) {
				System.out.println("Buzz");
			}else if ((i%fizzNum == 0) && (i%buzzNum == 0)){
				System.out.println("FizzBuzz");
			}else {
				System.out.println(i);
			}
		}
    scanner.close();
	}
}
