 class stack{
	int stack1[] = new int[10] ;
	int tos=(-1);
	int capacity = 10;
	int k;
	
	public  void push(int h)
	{  
	    k=h;
	
		if (tos==(capacity-1))
		{
			System.out.println("stack overflow");
			return;
		}
		else 
		{
			tos++;
			stack1[tos]=k;
		}
		
	}
	
	  public int   pop()
	 {
		if (tos==(-1))
		{
			System.out.println("stack underflow");
			return(-1);
			
		}
		else{
			int k = stack1[tos];
			tos--;
			return(k);
			
		}
	 }
	 
	
	
	
	public void show()
	{
		int i;
		for (i = 0; i<= tos ; i++)
		{
			System.out.println("" + stack1[i]);
		}
	}
}




class A4{
	public static void main (String args[])
	{
		stack st = new stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		
		st.show();
		System.out.println("\n\n");
		
		st.pop();
		st.pop();
		st.show();
	}
}

