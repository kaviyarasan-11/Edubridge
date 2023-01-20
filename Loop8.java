import java.util.Scanner;
public class Loop8 {
	public static void main(String[] args) {
		//int count=0;
		int flag=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = obj.nextInt();
		if(num==0||num==1) {                               // 1 and 0 is not an prime number
			System.out.println("Its not prime numbers");
		}else
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.print("Its not prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.print("Its prime number");
		}
		obj.close();
	}
}
