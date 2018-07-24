import java.util.Scanner;
public class recarea {

	
	public static void main(String[] args)
	{
	
    System.out.println("Enter the height of the  rectangle");
   
    Scanner in = new Scanner(System.in);
    
    float h,w,area,perimeter;
    h = in.nextFloat();
    System.out.println("Enter the width of the rectangle");
    w = in.nextFloat();
    area = (h*w) ;
    perimeter = 2 * (h + w);
    System.out.println("Area := " +area);
    System.out.println("Perimeter :="+perimeter);
	}