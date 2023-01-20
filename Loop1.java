
public class Loop1 {
	public static void main(String[] args) {
		int n=1;
		for (int j = 1; j <=5; j++) { //outer loop-->row
			for (int i = 1; i <j; i++) { //inner loop-->column
				System.out.print(n+" " );
				n++;
			}                            
			System.out.println();//new line
		}

	}

}
