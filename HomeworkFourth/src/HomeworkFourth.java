import java.lang.Math;

public class HomeworkFourth {

	public static void main(String[] args) {
		for(int i = 1; i<1001; i++) {
			int toThePower = (int)Math.pow(2, i);
			int toThePowerPlusOne = (int)Math.pow(2, (i+1));
			
			int perfectNumber = toThePower * (toThePowerPlusOne - 1);
			System.out.println(perfectNumber);
		}

	}

}
