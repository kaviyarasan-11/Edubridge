import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Grade Obtained:");
		char check = obj.next().charAt(0);
		switch(check){
			case 'E':
				System.out.println("Excellent");
				break;
			case 'V':
				System.out.println("Very Good");
				break;
			case 'G':
				System.out.println("Good");
				break;
			case 'A':
				System.out.println("Average");
				break;
			case 'F':
				System.out.println("Fail");
				break;
			default :
				System.out.println("Please! enter the valid grade");
		}
	}

}
