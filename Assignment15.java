package regularClassStudyAssinment;
import java.util.Scanner;
public class Assignment15
{
    public static void main(String[] args) 
    {
	    System.out.println("Main Method");
	    System.out.println("Program is regarding eligibity for giving vote");
	    System.out.println("It based on the both the age and gender respectively");
	    Scanner s1=new Scanner(System.in);
	    System.out.println("Please write down your age");
	      int age=s1.nextInt();
	      System.out.println("Please write down your gender");
	      Scanner s2=new Scanner(System.in);
	      String gen=s2.next();
	    if(age>18)
	    {
	    	   if(gen=="Male")
	    	   {
	    		   
	    		   System.out.println("you are above 18 and male and hence you can vote");
	    	   }
	    	   else
	    	   {
	    		   System.out.println("you are above 18 but female and hence you cannot vote");
	    	   }
	    }
	    else
	    {
	    	System.out.println("You are not eligible to vote as you are below 18");
	    }
	    s1.close();
	}
}
