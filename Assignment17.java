//WAP to update a global variable in static & non-static method.
package regularClassStudyAssinment;
public class Assignment17
{
	int vivek=70;
	static void a()
	{
		Assignment17 a1=new Assignment17();
		a1.vivek=90;
		System.out.println(a1.vivek);
	}
	void b()
	{
		Assignment17 a2=new Assignment17();
		a2.vivek=900;
		System.out.println(a2.vivek);
	}
   public static void main(String[] args)
   {
	   a();
	   Assignment17 a3=new Assignment17();
	   a3.b();
    }
}
