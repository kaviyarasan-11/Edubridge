import java.util.Scanner;
public class Number {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please Enter Your ID :");
		int id = obj.nextInt();
		System.out.println("Please Enter Your password :");
		int pw = obj.nextInt();
		switch(id) {
			case 123:switch (pw){
						case 321:{
							System.out.println("Welcome Shammu");
							break;
						}
						default:{
							System.out.println("Incorrect Password");
						}
					}
			break;
			case 456:switch (pw){
						case 654:{
							System.out.println("Welcome Gilbert");
							break;
						}
						default:{
							System.out.println("Incorrect Password");
						}
					}
			break;
			default:{
				System.out.println("Incorrect Id");
			}
			}
		}
}
		

	
	

/*
 * 
*/
