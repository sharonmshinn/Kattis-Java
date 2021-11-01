//https://open.kattis.com/problems/hangingout

import java.util.Scanner;
public class HangingOutOnTheTerrace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
    //max is the max number of people that can be on the terrace
    //events is the numbers of people per group that enter or leave
		int max = scanner.nextInt();
		int events = scanner.nextInt();
		
    //an array to keep track of each "enter" or "leave" and the number
		String[] list = new String[events*2];
		
    /fill the String array with each word or number
		for(int i=0; i<events*2; i++) {
			list[i] = scanner.next();
		}
		
    //peopleNum is the peopel on the terrace
    //groups denied is the number of groups that couldn't be on the terrace due to max
		int peopleNum = 0;
		int groupsDenied = 0;
		
    //go over the array
		for(int i=0; i<events*2; i++) {
      //if the index (i) is divisible by two, and the string at that index is equal to "enter", then add the number
      //in the group if the number of people plus people on the terrace is less than or equal to max
			if(i%2 == 0) {
				int groupNum = Integer.parseInt(list[i+1]);
				if(list[i].equals("enter")) {
					if((peopleNum + groupNum) <= max) {
						peopleNum += groupNum;
          //else if they're more than the max allowed, we add 1 to the number of groups denied
					}else{
						groupsDenied += 1;
					}
        //if the index (i) is equal to "leave" then minus the number of people from the total out on the terrace
				}else if (list[i].equals("leave")) {
					peopleNum -= groupNum;
					}
				}
		}
    //print out the number of groups denied after all events are done
		System.out.println(groupsDenied);
    scanner.close();
	}
}
