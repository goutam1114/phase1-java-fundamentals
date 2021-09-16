package AccessModifiers;

public class PublicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c=new calc();
		System.out.println("a is "+c.a);
		System.out.println("b is "+c.b);
		c.add();
		
		
		System.out.println("difference is "+c.sub());

	}

}
class calc
{
	public int a=10,b=5;
    public	void add()
    {
    	System.out.println("sum is "+(a+b));
    }
    public int sub()
    {
    	int c=a-b;
    	return c;
    }
	
}