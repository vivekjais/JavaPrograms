//WAP Regarding Conditional Statement Using If  With All Logical Operators Present Til Now
package regularClassStudyAssinment;
import java.util.Scanner;
public class Assignment13 
{
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        System.out.println("Program is regarding the logical operator ");
    	Scanner s1=new Scanner(System.in);
    	System.out.println("Enter the Value of a:");
    	int a=s1.nextInt();
    	System.out.println("Enter the Value of b:");
    	int b=s1.nextInt();
    	
    	if(a>b)
    	{
    		System.out.println("1");
    	}
    	
    	if(a<b)
    	{
    		System.out.println("2");
    	}
    	
    	if(a>=b)
    	{
    		System.out.println("3");
    	}
    	
    	if(a<=b)
    	{
    		System.out.println("4");
    	}
    	
    	if(a==b)
    	{
    		System.out.println("5");
    	}
    	if(a!=b)
    	{
    		System.out.println("6");
    	}
    	s1.close();
	}
}
