import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		int total,percent;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the student Roll number:");
		String rollNo = obj.nextLine();
		System.out.println("Enter the student name:");
		String name = obj.nextLine();
		System.out.println("Enter the mark in physics:");
		int phyMark = obj.nextInt();
		System.out.println("Enter the mark in Chemistry:");
		int cheMark = obj.nextInt();
		System.out.println("Enter the mark in Computer Application:");
		int comMark = obj.nextInt();
		total = (phyMark+cheMark+comMark);
		percent = ((total*100)/300);
		System.out.println("Student Roll Number:" +rollNo);
		System.out.println("Student Name:" +name);
		System.out.println("Mark in Physics:" +phyMark);
		System.out.println("Mark in Chemistry:" +cheMark);
		System.out.println("Mark in Computer Application:" +comMark);
		System.out.println("Total mark of the Student:" +total);
		System.out.println("Total percentage of the Student:" +percent);
		System.out.println("Total of the Student:" +total);
		if((percent>50)&& (percent<75)) {
			System.out.println("Student pass in second class");
		}else if((percent>76)&& (percent<100)) {
			System.out.println("Student pass in First class");
		}
		else
			System.out.println("Student get fail in exam");
		
	}

}
