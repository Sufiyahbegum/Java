import java.util.*;
public class bintooct {
public static void main(String[] args) 
    {
        int binnum, binnum1,rem, decimal=0, quotient, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Binary Number : ");
        binnum = scan.nextInt();
        binnum1=binnum;
     
      while(binnum > 0)
        {
            rem = binnum % 10;
            decimal = decimal + rem*i;
            //System.out.println(rem);
            i = i*2;
            binnum = binnum/10;
        }   

		i=1;
        quotient = decimal;
		
        while(quotient > 0)
        {
            octnum[i++] = quotient % 8;
            quotient = quotient / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
 System.out.print("\n");
 
    }
}