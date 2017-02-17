public class stack<E>{
	char stack1[] = new char[4];
	int tos=-1;
	capacity = 4;
	public void E push(char k){
		if (tos==(capacity-1))
		{
			System.out.println("stack overflow");
			return;
		}
		else {
			tos++;
			stack1[tos]=k;
		}
	public char E pop(){
		if (tos==(-1))
		{
			System.out.println("stack underflow");
			return(-1);
			
		}
		else{
			char k = stack1[tos];
			tos--;
			return('k');
			
		}
	}
	void show()
	{
		int i;
		for (i = 0; i< tos ; i++)
		{
			System.out.println("" + stack1[i]);
		}
	}
}
	

}

class A2{
	public static void main (String args[])
	{
		stack st = new stack();
				
		stack1[0]= 'a';
		stack1[1]= 'b';
		stack1[2]= 'c';
		stack1[3]= 'd';
		
		
		
		for(int i =0 ; i< =3 ; i++)
		{
			st.push(char stack1[i]);
		}
		st.show();
		
		st.pop();
		st.pop();
				
		st.show();
				
			
		
	}
}





