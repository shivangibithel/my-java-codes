import input.*;
class input7
{
	public static void main(String s[])
	{
		Input i = new Input();
		boolean cont = true;
		int empcd;
		String name;
		float salary;
		while(cont)
		{
			empcd = i.intInput("Enter Employee Code : ");	
			name = i.stringInput("Enter Name : ");
			salary = i.floatInput("Enter salary : ");
			System.out.println("Employee Code = " + empcd);
			System.out.println("Employee Name = " + name);
			System.out.println("Employee Salary = " + salary);
			cont = i.booleanInput("Do you want to continue (true/false) : ");
		}
	}
}