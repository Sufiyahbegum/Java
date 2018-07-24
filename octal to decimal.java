import java.util.Scanner;

public class octtodec {
 
public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     long octal, decimal = 0;
     int i = 0;
     System.out.print("Enter an octal number: ");
    octal = in.nextLong();
    while (octal != 0) 
     {
      decimal = (long)(decimal + (octal % 10) * Math.pow(8, i++));
      octal = octal / 10;
     }
    System.out.print("Equivalent decimal number for the given Octal number is : " + decimal+"\n");
   }
}