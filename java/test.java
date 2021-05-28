interface X
{
	void a();
	void b();
	void c();
}
abstract class Y implements X
{
	public void a()
	{
	}
	public void c()
	{
	}
}
class Z extends Y
{
	public void b()
	{
	}
	
}