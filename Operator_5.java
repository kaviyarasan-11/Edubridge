import java.util.Scanner;
public class Operator_5 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = obj.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = obj.nextInt();
		num2+=num1;
		int total= num1*num2;
		System.out.println("Multiplication of Two numbers:"+total);

	}

}
