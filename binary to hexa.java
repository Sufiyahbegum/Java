import java.util.Scanner;
public class bintohex {
 public static void main(String[] args) 
 {
  int[] hex = new int[1000];
  int i = 1, j = 0, remainder, decimal = 0, binary;
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a Binary Number: ");
  binary = in.nextInt();
  while (binary > 0) {
   remainder = binary % 2;
   decimal = decimal + remainder * i;
   i = i * 2;
   binary = binary / 10;
  }
   i = 0;
  while (decimal != 0) {
   hex[i] = decimal % 16;
   decimal = decimal / 16;
   i++;
  }
  System.out.print("HexaDecimal value: ");
  for (j = i - 1; j >= 0; j--)
  {
   if (hex[j] > 9) 
   {
    System.out.print((char)(hex[j] + 55)+"\n");
   } else
   {
    System.out.print(hex[j]+"\n");
   }
  }
 }
}