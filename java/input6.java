import input.*;
class input6
{
	public static void main(String s[])
	{
		Input i = new Input();
		int num1=0,num2=0,sum=0;
		num1 = i.intInput("Enter First Number : ");	
		num2 = i.intInput("Enter Second Number : ");
		sum = num1 + num2;
		System.out.print("Sum = " + sum);
	}
}