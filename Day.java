import java.util.Scanner;
public class Day {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number:");
		char check = obj.next().charAt(0);
		switch(check){
			case '1':
				System.out.println("Sunday");
				break;
			case '2':
				System.out.println("Monday");
				break;
			case '3':
				System.out.println("Tuesday");
				break;
			case '4':
				System.out.println("Wednesday");
				break;
			case '5':
				System.out.println("Thursday");
				break;
			case '6':
				System.out.println("Friday");
				break;
			case '7':
				System.out.println("Saturday");
				break;
			default :
				System.out.println("Please! enter the valid number");
		}
	}

}
