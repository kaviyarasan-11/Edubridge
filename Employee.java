package employeepackage;
public class Employee {
	public int empid; private
	String empname; public
	int empage;
	Employee(int empid,String empname,int empage)
	{
		this.empid=empid;
		this.empname=empname;
		this.empage=empage;
	}
	void display()
	{
	System.out.println("employee id: "+empid);
	System.out.println("employee name: "+empname);
	System.out.println("employee age: "+empage);
	}
}
