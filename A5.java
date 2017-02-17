class outer{
	int a;
	int b;
	outer(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	class inner{
		public void show(){
			System.out.println("a = " + a +"b= " + b);
		}
	}	
		public void innercall()
		{
			inner o = new inner();
			o.show();
			
		}
	
}

class A5{
	public static void main (String args[] )
	{
		outer o1 = new outer(5,6);
		o1.innercall();
		
	}
}

//nested class
//we can access the variables a and b through inner class 
// for calling the function innercall with the object o1 we have to make it a function of outer class not inner class
