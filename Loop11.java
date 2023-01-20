import java.util.Scanner;
public class Loop11 {
	public static void main(String[] args) {
		int even=0,odd=0,zeros=0;
		Scanner obj =new Scanner(System.in);
		char ch;
		int num;
		do {
			System.out.println("Enter the number:");
			num=obj.nextInt();
			System.out.println("Number:"+num);
			if(num<0) {
				even =even+1;
			}else if(num>0) {
				odd=odd+1;
			}else
				zeros = zeros+1;
			System.out.println("If you want to enter the number again print Y?:");
			ch = obj.next().charAt(0);
		}while((ch=='Y')||(ch=='y'));
		System.out.println("Count of even numbers:"+even);
		System.out.println("Count of even numbers:"+odd);
		System.out.println("Count of even numbers:"+zeros);
	}

}
