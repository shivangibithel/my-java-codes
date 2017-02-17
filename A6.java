abstract class Anomexample{
abstract void yourmsg();

	
}

class A6{
	public static void main(String args[])
	{
		Anomexample o = new Anomexample(){
			public void yourmsg(){
				System.out.println(" this is ur msg");
				
			}
		};
		
		o.yourmsg();
	}
}

//inner anonymous class example



