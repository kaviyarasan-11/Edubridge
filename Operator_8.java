import java.util.Scanner;
public class Operator_8 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = obj.nextInt();
		String Check = (num<100 && num>200) ? "Given number is greater than 100":"Given number is greater than 200";
		/*String Check = (num>=0&&num<100 )?(num>=100&&num<200 ? "Given number is less than 100":"Given number is greater than 100")
				:(num>=200 ?"Given number is greater than 200":"Enter the valid value");*/
		
		System.out.print(Check);
	}

}

/*;*/