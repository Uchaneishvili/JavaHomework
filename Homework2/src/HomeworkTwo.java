
public class HomeworkTwo {

	public static void main(String[] args) {
		
		Person prsn = new Person("Giga", "Uchaneishvili", "Irakli",35001123520L,"2 Leonidze st, 54");

		System.out.println(prsn.firstName);
		System.out.println(prsn.lastName);
		System.out.println(prsn.fatherName);
		System.out.println(prsn.pid);
		System.out.println(prsn.address);
		
		
		Person prsnTwo = new Person();
		
		prsnTwo.firstName="Giorgi";
		prsnTwo.lastName = "Maridashvili";
		prsnTwo.fatherName = "Akaki";
		prsnTwo.pid =  35005505032L;
		prsnTwo.address = "4 Shartava st. 26";
		
		System.out.println("");
		System.out.println(prsnTwo.firstName);
		System.out.println(prsnTwo.lastName);
		System.out.println(prsnTwo.fatherName);
		System.out.println(prsnTwo.pid);
		System.out.println(prsnTwo.address);
		
	}

}
