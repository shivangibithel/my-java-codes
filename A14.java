package mypack;

public class A14 implements mammal2{
	public void eat(){
		System.out.println(" mammal eats");
	}
	public void travel()
	{
	System.out.println(" mammal travells");
	
	}
	public static void main (String args[])
	{
		A14 o1 = new A14();
		
		o1.eat();
		o1.travel();
		
	}
}

//command javac -d . A14.java
// javac A14.java
//java mypack.A14
 // this is to make a class A14 in my pack folder and then to run and print 
 

