import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		int num = 0;
		
		while(num == 0) {
			System.out.print("Type a vowel from the keyboard: ");
			
			String input = scnr.nextLine();
			String inputToLowerCase = input.toLowerCase();
			
			if(inputToLowerCase.equals("vowel")) {
				System.out.println("OK");
			}else if(inputToLowerCase.equals("!")) {
				num = 1;
				scnr.close();

			}	
		}	
	}
}
