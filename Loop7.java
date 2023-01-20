import java.util.Scanner;
public class Loop7 {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		Scanner obj = new Scanner(System.in);
		//System.out.println("Enter the number:");
		char ch;
		do {
			System.out.println("Enter the number");
			int num =obj.nextInt();
			if(num%2==0) {
				count++;
			}else{
				count1++;
			}
			System.out.println("Do you want to enter the next number print Y");
			ch =obj.next().charAt(0);
		}while(ch == 'Y');
		System.out.println("Even Count:"+count);
		System.out.println("Odd Count:"+count1);
	}

}
