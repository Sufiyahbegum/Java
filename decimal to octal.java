import java.util.Scanner;
public class dectooct {
      public static void main(String args[])
    {
            int decimal, rem, quotient, i=1, j;
        int octal[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Decimal Number: ");
        decimal = scan.nextInt();
		
        quotient = decimal;
		
        while(quotient != 0)
        {
            octal[i++] = quotient%8;
            quotient = quotient/8;
        }
		
        System.out.print("Converted Octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octal[j]);
        }
		System.out.print("\n");
    }
}