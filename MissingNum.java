//https://open.kattis.com/problems/missingnumbers

import java.util.Scanner;

public class MissingNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//first input is the number of numbers that we will input, must be in order
		int number = scanner.nextInt();
		int[] array = new int[number];
		
		//inputing n numbers 
		for(int i=0; i<number; i++) {
			array[i] = scanner.nextInt();
		}
		
		
		//if the amount of numbers is not equal to the number we first inputted
		if(array[number-1] - number != 0) {
			String output = "";
			//if the first number is not equal to 1, then we must print 1
			if(array[0] != 1) {
				for(int i=1; i<array[0]; i++) {
					System.out.println(i);
			//for the rest of the numbers, if a number minus the previous number doesn't equal 1, we must add the missing numbers
			for(int j=0, k=j+1; j<number&&k<number; j++, k++) {
				if(array[k] - array[j] != 1) {
					for(int m=array[j]+1; m<array[k]; m++) {
						output += m + " ";
						}
					}
				}
			}
			
			//split the String of numbers we missed by spaces
			String[] missedNum = output.split(" ");
			//print each number we missed in the split array
			for(int i=0; i<missedNum.length; i++) {
				System.out.println(missedNum[i]);
			}
		//if the amount of numbers is equtl to the number we first inputted, print "good job"
		}else {
			System.out.println("good job");
			}

		
		}
		scanner.close();

	}

}
