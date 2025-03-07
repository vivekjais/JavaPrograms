//WAP Calling 2 Static and 2 Non-Static Method Inside Main Method
package regularClassStudyAssinment;
public class Assignment12 {
	
	static void main()
	{
		System.out.println("Static Method1");
	}
	static void main(int a)
	{
		System.out.println("Static Method2");
	}
	 void vivek()
		{
		 System.out.println("Non-Static Method1");
		}
	 void vivek(int a)
		{
		 System.out.println("NoN-Static Method2");
		}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		main();
		main(30);
		Assignment12 a1= new Assignment12();
		a1.vivek();
		a1.vivek(30);
	}
}
