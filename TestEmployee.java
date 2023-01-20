import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		//System.out.println("Enter the number of employee you want store:");
		//int num = obj.nextInt();
		Employee employee = new Employee();
			employee.setDetails("Ajay",30000.00f , "Associate");
			System.out.println("Employee Name:"+employee.getName()+" "+"Employee Salary:"+
					employee.getSalary()+" "+"Employee Designation:"+employee.getDesignation());
			System.out.println(" ----------------------------------------------------------");
			
			employee.setDetails("Shammu",50000.00f , "Manager");
			employee.increaseSalary(1000.00f);
			System.out.println("Employee Name:"+employee.getName()+" "+"Employee Salary:"+
					employee.getSalary()+" "+"Employee Designation:"+employee.getDesignation());
			System.out.println(" ----------------------------------------------------------");
			
			employee.setDetails("Gibert",30000.00f , "Associate");
			System.out.println("Employee Name:"+employee.getName()+" "+"Employee Salary:"+
			employee.getSalary()+" "+"Employee Designation:"+employee.getDesignation());
		
		
	}

}
