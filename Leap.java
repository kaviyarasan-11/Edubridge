import java.util.Scanner;
public class Leap {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = obj.nextInt();
		if((year%4==0)||(year%400==0)||((year%100==0)&&(year%400==0))){
			System.out.println("Yeah! ,its Leap Year");
		}else{
				System.out.println("No!, its not a leap year");
			}

	}

}
