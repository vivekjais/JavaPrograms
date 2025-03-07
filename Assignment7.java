//WAP To Call Method Overloading
package regularClassStudyAssinment;
public class Assignment7 
{
	static void main()
	{
		System.out.println("Method Overloading1");
	}
	static void main(int a)
	{
		System.out.println("Method Overloading2");
	}
	static void main(int a,int b)
	{
		int sum=a+b;
		System.out.println("Method Overloading3");
		System.out.println(sum);
	}
	static void main(double a,double b)
	{
		double sum = a+b;
		System.out.println("Method Overloading4");
		System.out.println(sum);
	}
	void main(double a)
	{
		double sum= a+3.567;
		System.out.println("Method Overloading5");
		System.out.println(sum);
	}
   public static void main(String[] args) 
   {
      System.out.println("Main Method");	
      main();
      main(30);
      main(30,50);
      main(56.789,98.765);
      Assignment7 a1=new Assignment7();
      a1.main(87.543);
   }
}
