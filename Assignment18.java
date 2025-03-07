//WAP using For Loop to achieve 5 random results for both Area & Circumference of Circle.
package regularClassStudyAssinment;
public class Assignment18 
{
    public static void main(String[] args)
    {
    	for(int i=1;i<=5;i++)
    	{
    		double pie=Math.PI;
        	double radius=Math.random();
    		double aoc=pie*radius*radius;
    		double coc=2*pie*radius;
    		System.out.println("........................");
    	   	System.out.println("The Calculated area of circle="+aoc);
    	   	System.out.println("The Calculated cicumferance of circle="+coc);
    	}
	}
}
