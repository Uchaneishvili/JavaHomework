import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int reminder;
		int count = 0;
		int input = scnr.nextInt();
		scnr.close();
		
		for(int i = 1; i<=input; i++) {
			
			reminder = input % i;
			
			if(reminder == 0) {
				count++;
				
			}			
		}
		
		if(count != 2) {
			System.out.println(input + " is not prime number");
		} else {
			System.out.println(input + " is prime number");
		}
		
	}	
	
}
