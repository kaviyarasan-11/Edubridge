package employeepackage;
public class Manager {
	public
	int managerid; private String
	managername; public int
	managerage; public float
	managersalary;
	Manager(int managerid,String managername,int managerage,float managersalary)
			{ this.managerid=managerid;
			this.managername=managername;
			this.managerage=managerage;
			this.managersalary=managersalary;
			} 
	void displayManager()
	{
	System.out.println("manager id: "+managerid);
	System.out.println("manager name: "+managername);
	System.out.println("manager age: "+managerage);
	System.out.println("manager salary: "+managersalary);
	}
}
