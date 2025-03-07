//WAP To Call Constructor Overloading
package regularClassStudyAssinment;
public class Assignment8 {
	Assignment8()
	{
		System.out.println("Constructor Overloading1");
	}
	Assignment8(int a)
	{
		System.out.println("Constructor Overloading2");
	}
	Assignment8(float a)
	{
		System.out.println("Constructor Overloading3");
	}
	Assignment8(boolean a)
	{
		System.out.println("Constructor Overloading4");
	}
	Assignment8(String a)
	{
		System.out.println("Constructor Overloading5");
	}
	Assignment8(boolean a,boolean b,char gender)
	{
		System.out.println("Constructor Overloading6");
	}
	public static void main(String[] args)
	{
		new Assignment8();
		new Assignment8(30);
		new Assignment8(50.67f);
		new Assignment8(false);
		new Assignment8("Vivek");
		new Assignment8(false,true,'M');
		
		
	}

}
