//WAP To Call Static Method In Main Method 
package regularClassStudyAssinment;
public class Assignment3 
{
	static void main()
	{
		System.out.println("Calling Static Method Inside Main Method1");
	}
	static void main(int a)
	{
		System.out.println("Calling Static Method Inside Main Method2");
	}
	static void main(double a)
	{
		System.out.println("Calling Static Method Inside Main Method3");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		main();
		main(30);
		main(30.09876);
	}

}
