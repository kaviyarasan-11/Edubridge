import java.util.Scanner;
public class Loop9 {
	public static void main(String[] args) {
		int count=0;
		int min;
		Scanner obj =new Scanner(System.in);
		System.out.print("Enter the first number:");
		int  num1=obj.nextInt();
		System.out.print("Enter the first number:");
		int  num2=obj.nextInt();
		min=num1<num2? num1:num2;    // to find the minimum number 
		for(int i=1;i<=min;++i) {
			if(num1%i==0 && num2%i==0) {
				count=i;
			}
		}
		System.out.print("GCD of two numbers:"+count);
		obj.close();
		}

}
