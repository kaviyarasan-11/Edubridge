import java.util.Scanner;
public class Operator_4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = obj.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = obj.nextInt();
		System.out.println((num1==num2)||((num1!=num2)));
		System.out.println((num1<=num2)&&(num1>=num2));
		System.out.println(!(num1>=num2));
		System.out.println((num1>num2)||(num1<num2));
		

	}

}
