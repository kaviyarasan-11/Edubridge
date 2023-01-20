import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Symbol:");
		char con = obj.next().charAt(0);
		switch(con) {
		case '+':
			System.out.println("Enter the first number:");
			double add1 = obj.nextDouble();
			System.out.println("Enter the Second number:");
			double add2 = obj.nextDouble();
			System.out.println("Add :"+(add1+add2));
			break;
		case '-':
			System.out.println("Enter the first number:");
			double sub1 = obj.nextDouble();
			System.out.println("Enter the Second number:");
			double sub2 = obj.nextDouble();
			System.out.println("Sub :"+(sub1-sub2));
			break;
		case '*':
			System.out.println("Enter the first number:");
			double mul1 = obj.nextDouble();
			System.out.println("Enter the Second number:");
			double mul2 = obj.nextDouble();
			System.out.println("Mul :"+(mul1*mul2));
			break;
		case '/':
			System.out.println("Enter the first number:");
			double div1 = obj.nextDouble();
			System.out.println("Enter the Second number:");
			double div2 = obj.nextDouble();
			System.out.println("Div :"+(div1/div2));
			break;
		case '!':
			System.out.println("Enter the first number:");
			float rem1 = obj.nextFloat();
			System.out.println("Enter the Second number:");
			float rem2 = obj.nextFloat();
			System.out.println("Rem :"+(rem1%rem2));
			break;
		case '%':
			System.out.println("Enter the first number:");
			float per1 = obj.nextFloat();
			System.out.println("Enter the Second number:");
			float per2 = obj.nextFloat();
			float per =((per1*100.0f)/per2);
			//float per =(((per2-per1)*100)/per1);
			System.out.println("Per :"+(per));
			break;
			
			default:
				System.out.println("Error");
		}
	}
}
