import java.util.Scanner;
public class Loop5 {
	public static void main(String[] args) {
		int count=1;
		int total=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = obj.nextInt();
		System.out.println("Enter the second number :");
		int num2 = obj.nextInt();
		for(int i=1;i<=num2;i++) {
			count = count*num1;
		}
		System.out.println(count);
	}

}
