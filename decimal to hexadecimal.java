import java.util.Scanner;
public class dectohex {
      public static void main(String args[])
    {
        int decimal, rem;
        String hexdecimal="";
        
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Enter a decimal number: ");
        decimal = in.nextInt();
		
        while(decimal>0)
        {
            rem = decimal%16;
            hexdecimal = hex[rem] + hexdecimal;
            decimal = decimal/16;
        }
        System.out.print("Hexadecimal number is : "+hexdecimal+"\n");         
    }
}
