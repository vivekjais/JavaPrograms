//WAP to call Scanner methods
package regularClassStudyAssinment;
import java.util.Scanner;
public class Assignment9
{
public static void main(String[] args)
  {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter The Value Of A");
	byte a= s1.nextByte();
	System.out.println("Enter The Value Of B");
	short b =s1.nextShort();
	System.out.println("Enter The Value Of C");
	int c=s1.nextInt();
	System.out.println("Enter The Value Of D");
	long d=s1.nextLong();
	long sum=a+b+c+d;
	System.out.println(sum);
	System.out.println("Enter The Value Of E");
	float e=s1.nextFloat();
	System.out.println("Enter The Value Of F");
	double f=s1.nextDouble();
	double fpv=e+f;
	System.out.println(fpv);
	System.out.println("Enter The Value Of Name");
	String name=s1.next();
	System.out.println(name);
	s1.close();
   }
}
