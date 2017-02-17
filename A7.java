class outer {
int a;
int b;

outer (int a,int b)
{
	this.a = a;
	this.b=b;
	
}
public class inner {
	public void show (){
		System.out.println("" + a +"" + b);
	
	}
}
}

class A7{
	public static void main (String args[])
	{
		outer o = new outer(5,6);
		outer.inner in = o.new inner();
		in.show();
		
	}
}

//to execute inner class from main