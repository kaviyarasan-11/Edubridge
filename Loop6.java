import java.util.Scanner;
public class Loop6 {
	public static void main(String[] args) {
		int count;
		int rev =0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num = obj.nextInt();
		while(num!=0) {
			count = num%10;
			rev = rev*10+count;
			num=num/10;
		}
		System.out.print("Reversed number:"+rev);
	}

}
