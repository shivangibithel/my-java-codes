class stack{
	char stack1[] = new char[3] ;
	int tos=-1;
	int capacity = 3;
	char h;
	
	
	public void push(char k){
		
		h=k;
		
		if (tos==(capacity-1))
		{
			System.out.println("stack overflow");
			return;
		}
		else {
			tos++;
			stack1[tos]=h;
		}
	
	}
	
	 public char pop()
	 {
		if (tos==(-1))
		{
			System.out.println("stack underflow");
			return('\0');
			
		}
		else{
			char k = stack1[tos];
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




class A3{
	public static void main (String args[])
	{
		stack st = new stack();
		st.push('d');
		st.push('f');
		st.push('d');
		st.show();
		
		
		st.pop();
		st.pop();
		
		
		st.show();
	}
}

