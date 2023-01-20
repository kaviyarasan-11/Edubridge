import java.util.Scanner;
import java.lang.String;
public class Month {
	public static void main(String[] args) {
		int Days=0;
		String mon="month";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number:");
		int check = obj.nextInt();
		switch(check){
			case 1:
				mon = "January";
				Days = 31;
				break;
			case 2:
				mon = "Febuary";
				Days = 28;
				break;
			case 3:
				mon = "March";
				Days = 31;
				break;
			case 4:
				mon = "April";
				Days = 30;
				break;
			case 5:
				mon = "May";
				Days = 31;
				break;
			case 6:
				mon = "June";
				Days = 30;
				break;
			case 7:
				mon = "July";
				Days = 31;
				break;
			case 8:
				mon = "August";
				Days = 31;
				break;
			case 9:
				mon = "September";
				Days = 30;
				break;
			case 10:
				mon = "October";
				Days = 31;
				break;
			case 11:
				mon = "November";
				Days = 30;
				break;
			case 12:
				mon = "December";
				Days = 31;
				break;
			default :
				System.out.println("Please! enter the valid number");
		}
		System.out.println(mon + "=" +Days);
	}

}
