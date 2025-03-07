package regularClassStudyAssinment;
import java.util.Scanner;
public class Assignment14
{
 public static void main(String[] args) 
    {
	System.out.println("Main Method");
	System.out.println("Program is regardint the voting elibiglity");
	 System.out.println("Please do enter your age");
	Scanner s1=new Scanner(System.in);
	 int age = s1.nextInt();
	 
	if(age>=18)
	{
	    System.out.println("you are above 18 you can vote");
    }
	else
	{
		 System.out.println("you are below 18 you can not vote");
	}
	s1.close();
	}
}
