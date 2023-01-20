import java.util.Scanner;
public class Department {
	public static void main(String[] args) {
		Depart dep;
		dep = new Depart();
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter how many number do you want store the students information :");
		int num = obj.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the Student department name:");
			dep.DepartName =obj.nextLine();
			obj.nextLine();
			System.out.println("Enter the Student Student name:");
			dep.StudentName=obj.nextLine();
			System.out.println("Enter the Student Student Id:");
			dep.StudentId =obj.nextInt();
			obj.nextLine();
			System.out.println("Enter the Student Student Mobile number:");
			dep.StudentMob =obj.nextLine();	
			System.out.println("Enter the Student Student address:");
			dep.StudentAddress =obj.nextLine();
			
			System.out.println("Student Department:"+dep.DepartName);
			System.out.println("Student Name:"+dep.StudentName);
			System.out.println("Student StudentId:"+dep.StudentId);
			System.out.println("Student MobileNumber:"+dep.StudentMob);
			System.out.println("Student Address:"+dep.StudentAddress);
		}
		obj.close();
	}

}
