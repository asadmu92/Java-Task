
package bscs;
class maths{
    
	public void Add()
	{
		          System.out.println(2+2);
	}

	public void Add(int n1,int n2)
	{
		System.out.println(n1+n2);
	}

	public void Add(int n1,int n2,int n3)
	{
		System.out.println(n1+n2+n3);
	}
	public void Add(float n1,float n2,float n3)
	{
		System.out.println(n1+n2+n3);
	}
}
public class overloadingDemo {
    public static void main(String[] args) {
        
        maths m1=new maths();
        m1.Add();
        m1.Add(2,3);
        m1.Add(2,5,6);
        m1.Add(2.3f,4.4f,5.1f);
        
    }
    
}
