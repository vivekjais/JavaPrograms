//WAP to create relation between 2 classes having static methods using extends keyword.
//Single Level Inheritance.
package regularClassStudyAssinment;
class Parent
{
	 static void login(int a)
	 {
		 
		 System.out.println("Login to Amazon");
	 }
	 static void logout(int b)
	 {
		 
		 System.out.println("Logout to Amazon");
	 }
}
public class Assignment19 extends Parent
{
	static void Testcase1()
	{
		System.out.println("Searching A Product To Amazon");
	}
   public static void main(String[] args)
   {
     login(30);
     Testcase1();
     logout(40);
   }
}
