import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int[] price = new int [20];
		int i;
		int sum = 0;
		int count = 0;
		for(i = 0; i<20; i++) {	
			
			if(i == 1) {
				System.out.print("Enter the " + (i+1) + "nd number: ");

			}else {
				System.out.print("Enter the " + (i+1) + "th number: ");
			}
			
			price[i] = scnr.nextInt();
			sum = sum +  price[i];

			
		}
		scnr.close();
		System.out.println("Sum of the prices: " + sum);
		
		int averages = sum / 20;

		System.out.println("Averages of the prices: " + averages);
		
		
		System.out.println("More than average price: ");

		  for(int j = 0; j < 20; j++) {
			  if(price[j] > averages) {
				  System.out.println(price[j]);
			  }
		  }
		  
		  System.out.println("All value less then 5: ");
		  
		  for (int k = 0; k < 20; k ++) {
			  if(price[k] < 5) {
					count++;
					System.out.println(price[k]);

				}
		  }

		

		
		

	}

}
