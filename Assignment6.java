/*WAP to Area and Circumference for Square,
Triangle, Rectangle and Circle using scanner class*/
package regularClassStudyAssinment;
import java.util.Scanner;
public class Assignment6 
{
	public static void main(String[] args) 
	{
	   System.out.println("........................................");
	   Scanner s1= new Scanner(System.in);
	   System.out.println("Calculating Area Of Sqaure");
	   System.out.println("Enter The Value Of A");
	   float a= s1.nextFloat();
	   System.out.println("Enter The Value Of B");
	   float b=s1.nextFloat();
	   float aos = a*b;
	   System.out.println("Area Of The Sqaure Is -->");
	   System.out.println(aos);
	   System.out.println("Calculating Perimeter Of Sqaure");
	   System.out.println("Enter the value Of C");
	   float c=s1.nextFloat();
	   float pos=4*c;
	   System.out.println("Permimeter Of Sqaure Is-->");
	   System.out.println(pos);
	   System.out.println("........................................");
	   System.out.println("Calculating Area Of Triangle");
	   System.out.println("Enter The Value Of D");
	   float d= s1.nextFloat();
	   System.out.println("Enter The Value Of E");
	   float e=s1.nextFloat();
	   float aot = 0.5f*d*e;
	   System.out.println("Area Of The Triangle Is -->");
	   System.out.println(aot);
	   System.out.println("Calculating Perimeter Of Triangle");
	   System.out.println("Enter the value Of f");
	   float f=s1.nextFloat();
	   System.out.println("Enter the value Of g");
	   float g=s1.nextFloat();
	   System.out.println("Enter the value Of h");
	   float h=s1.nextFloat();
	   float pot=f+g+h;
	   System.out.println("Permimeter Of Triangle Is-->");
	   System.out.println(pot);
	   System.out.println("........................................");
	   System.out.println("Calculating Area Of Rectangle");
	   System.out.println("Enter The Value Of I");
	   float i= s1.nextFloat();
	   System.out.println("Enter The Value Of J");
	   float j=s1.nextFloat();
	   float aor = i*j;
	   System.out.println("Area Of The Rectangle Is -->");
	   System.out.println(aor);
	   System.out.println("Calculating Perimeter Of Rectangle");
	   System.out.println("Enter the value Of K");
	   float k=s1.nextFloat();
	   System.out.println("Enter the value Of L");
	   float l=s1.nextFloat();
	   float por=2*(k*l);
	   System.out.println("Permimeter Of Rectangle Is-->");
	   System.out.println(por);
	   System.out.println("........................................");
	   System.out.println("Calculating Area Of Circle");
	   System.out.println("Enter The Value Of M");
	   float m= s1.nextFloat();
	   float aoc = 3.14f*m*m;
	   System.out.println("Area Of The Circle Is -->");
	   System.out.println(aoc);
	   System.out.println("Calculating Circumferance Of Circle");
	   System.out.println("Enter the value Of N");
	   float n=s1.nextFloat();
	   float poc=2*3.14f*n;
	   System.out.println("Permimeter Circle Is-->");
	   System.out.println(poc);
	   s1.close();
	}
}
