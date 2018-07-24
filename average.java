import java.util.Scanner;


public class aver {

	public static void main(String[] args)
	{
		
	System.out.println("Enter the numbers who's average is to be calculated");
	 int a,b,c,d,e,f;
     
     
     Scanner in = new Scanner(System.in);
     a = in.nextInt();
     b = in.nextInt();
     c = in.nextInt();
     
     float average = (a+b+b) / 3 ;
     System.out.println("Average := "+average);
	}

}