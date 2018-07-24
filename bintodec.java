import java.util.Scanner;
public class bitodec {
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  long binary, decimal = 0, j = 1, remainder;
  System.out.print("Enter a binary number: ");
  binary = sc.nextLong();

  while (binary != 0) 
  {
   remainder = binary % 10;
   decimal = decimal + remainder * j;
   j = j * 2;
   binary = binary / 10;
  }
  System.out.println("Converted Decimal Number: " + decimal);
 }
}