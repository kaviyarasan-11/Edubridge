import java.util.Scanner;
public class Loop3 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number for multiplication:");
		int num = obj.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" "+"x"+" "+i+" "+"="+" "+(num*i));
		}

	}

}
