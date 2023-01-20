import java.util.Scanner;
public class Check {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Character:");
		char charac = obj.next().charAt(0);
		if((charac>='0') && (charac<='9')) {
			System.out.println("Given character is number");
		}else if(((charac>='A')&&(charac<='Z')) ||((charac>='a')&&(charac<='z'))) {
			System.out.println("Given character is Alphabet");
		}else
			System.out.println("Given character is Symbol");
	}

}
