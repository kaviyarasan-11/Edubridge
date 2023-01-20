import java.util.Scanner;
public class Details {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Father name :");
		String fatherName = myObj.nextLine();

		System.out.println("Mother name :");
		String motherName = myObj.nextLine();
		System.out.println("Address :");
		String address = myObj.nextLine();

		System.out.println("Age :");
		int age = myObj.nextInt();

		System.out.println("Salary :");
		int salary = myObj.nextInt();

		System.out.println("Phone Number :");
		long phoneNumber = myObj.nextLong();

		System.out.println("Father Name :" + fatherName);
		System.out.println("Mother Name :" + motherName);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + salary);
		System.out.println("Phone Number :" + phoneNumber);
		System.out.println("Address :" + address);
		
	}

}

/*public class Details {
	public static void main(String[] args) {
		System.out.print("                                           hello"+ '\n' + "         welcome      to" +'\n' + "     edubridge        online      classes");
		
		
	}

}*/
