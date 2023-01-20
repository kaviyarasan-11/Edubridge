import java.util.Scanner;
public class Operator_9 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = obj.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = obj.nextInt();
		String Check = (num1==num2)?"Given both numbers are Same":"Given both numbers are different";
		System.out.println(Check);
	}

}
