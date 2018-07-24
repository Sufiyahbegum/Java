import java.util.Scanner;
public class dectobin 
{
      public static void main(String args[])
    {
        int decimel, remainder, quotient, i=1, j;
        int binary[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        decimel = scan.nextInt();
		
        quotient = decimel;
		
        while(quotient != 0)
        {
            binary[i++] = quotient%2;
            quotient = quotient/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binary[j]);
        }
        System.out.print("\n");
    }
}