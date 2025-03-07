//WAP to update a local variable in static & non-static method.
package regularClassStudyAssinment;
public class Assignment16 
{
	 static void add()
	 {
	     int a=20;
	     a=40;
	     System.out.println(a);
	 }
	 void sub()
	 {
		 int b=50;
		 b=600;
		 System.out.println(b);
	 }
  public static void main(String[] args)
  {
	System.out.println("Main Method");
	 add();
	 Assignment16 a1 = new Assignment16();
	 a1.sub();
  }
}
