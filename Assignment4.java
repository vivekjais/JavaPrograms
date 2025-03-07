//WAP To Call Non-Static Method Inside Main Method
package regularClassStudyAssinment;
public class Assignment4 
{
	void main()
	{
		System.out.println("Calling Non-Static Method Inside Main Method");
	}
    public static void main(String[] args) 
    {
		System.out.println("Main Method");
		//Creating A Object For Calling Non-Static Method Inside Main Method 
		Assignment4 a1= new Assignment4();
		a1.main();
	}
}
