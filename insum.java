import java.util.Scanner;
	 
	public class input {
	
	   public static void main(String args[])
	   {
	      int a, b, c;
	      System.out.println("Enter the first number ");
	      
	      Scanner in = new Scanner(System.in);
	      a = in.nextInt();
	      
	      System.out.println("Enter the second number ");
	      b = in.nextInt();
	      
	      c = a + b;
	      System.out.println("Sum  = "+c);
	   }
	
	}