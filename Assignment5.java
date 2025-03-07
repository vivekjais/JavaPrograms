//WAP To Call Constructor In Main Method
package regularClassStudyAssinment;
public class Assignment5
{
	Assignment5()
	{
		System.out.println("Constructor Calling Inside Main Method");
	}
  public static void main(String[] args)
  {
	  System.out.println("Main Method"); 
	  new Assignment5();
  }
}
