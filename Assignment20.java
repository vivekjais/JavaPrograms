//WAP to create relation between 2 classes having non-static methods using extends keyword.
//Single Level Inheritance.
package regularClassStudyAssinment;
class Parents
{
   void add()
   {
	   System.out.println("Adding a product into cart");
   }
     void payment()
     {
            	 System.out.println("Paying the product payment");
     }
}
public class Assignment20 extends Parents 
{
	void login()
	{
		System.out.println("Login to amazon");
	}
   public static void main(String[] args)
   {
	   Assignment20 a1=new Assignment20();
	   a1.login();
	Parents p1=new Parents();
	p1.add();
	p1.payment();
	
   }
}
