import java.util.Scanner;
import java.lang.String;
public class Summa {
	public static void main(String[] args) {
		int temp=0;
		String str = "Unknown";
		System.out.println("Enter the Month:");
		Scanner obj = new Scanner(System.in);
		String mon = obj.nextLine();
		//char charc = obj.next().charAt(0);
		switch(mon) {
		case "january","March","May","July","August","October","December":
			str = "1";
		break;
		case "April","June","September","November":
			str = "2";
			break;
		case "Febuary":
			str= "3";
			break;
		default :
			System.out.println("Please! enter the valid number");
			
		}
		//System.out.println(str);
		if(str == "1") {
			System.out.println("31 Days");
		}else if(str == "2") {
			System.out.println("30 Days");
			
		}else
			System.out.println("28 Days");
	}

}




/*if(mon == "July"|| mon== "August"||mon=="October" ||mon=="December" || mon=="January" || mon=="March" ) {
	//s = "1";
	System.out.println("1");
	
}else if(mon == "April"|| mon== "June"||mon=="September" ||mon=="November" ) {
	System.out.println(s1);
	
}else if(mon == "Febuary"){
	System.out.println(s2);
}


switch(str){
			case "1":
				System.out.println("31");
				break;
			case "2":
				System.out.println("30");
				break;
			case "3":
				System.out.println("28");
				break;
			
			default :
				System.out.println("Please! enter the valid number");
*
*
*/