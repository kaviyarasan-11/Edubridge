import java.util.Scanner;
public class Loop12 {
	public static void main(String[] args) {
		int temp=0;
		Scanner obj=new Scanner(System.in);
		char ch;
		int num;
		int large =Integer.MAX_VALUE;    // it is constant in the integer class present in lang package max value that can be represent in the 32 bit 
		int small =Integer.MIN_VALUE;    //min value that can be represent in the 32 bit 
		do {
			System.out.println("Enter the number:");
			num = obj.nextInt();
			System.out.println("Number:"+num);
			if(num>temp) {
				large =num;
			}else if(num<temp) {
				small=num;
			}else
				System.out.println(" ");
			temp=num;
			System.out.println("If you want to enter the number again print Y?:");
			ch = obj.next().charAt(0);
		}while((ch=='Y')||(ch=='y'));
		System.out.println("Count of even numbers:"+large);
		System.out.println("Count of even numbers:"+small);
	}

}
