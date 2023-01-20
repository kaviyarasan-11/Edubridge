import java.util.Scanner;
public class Operator_7 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the age of student:");
		int num = obj.nextInt();
		String Check = (num%2==0)? "Given number is even":"Given number is odd";
		System.out.println(Check);

	}

}
