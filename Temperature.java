import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the current temperature:");
		float temp = obj.nextFloat();
		if(temp<=0) {
			System.out.println("Its too Freezing weather");
		}else if((temp>=0) &&(temp<30)) {
			System.out.println("Its Cold weather");
		}else if((temp>=31) &&(temp<36)) {
			System.out.println("Its noraml weather");
		}else 
		{
			System.out.println("Its too Hot");
		}

	}

}