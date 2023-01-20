import java.util.Scanner;
public class Operator_6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the age of student:");
		int num = obj.nextInt();
		String check = num>=18? "Given age of the student is greater than 18":"Given age of the student is greater than 18";
		System.out.println(check);
	}

}
