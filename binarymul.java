import java.util.Scanner;
public class bimul 
{
 public static void main(String[] args)
 {
  long a, b, multiply = 0;
  int digit, factor = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Input the first binary number: ");
  a = in.nextLong();
  System.out.print("Input the second binary number: ");
  b = in.nextLong();
  while (b != 0)
  {
   digit = (int)(b % 10);
   if (digit == 1) 
   {
    a = a * factor;
    multiply = binaryproduct((int) a, (int) multiply);
   } 
   else
   {
    a = a * factor;
   }
   b = b / 10;
   factor = 10;
  }
  System.out.print("Product of two binary numbers: " + multiply+"\n");
 }
 static int binaryproduct(int a1, int b1) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (a1 != 0 || b1 != 0) 
  {
   sum[i++] = (a1 % 10 + b1 % 10 + remainder) % 2;
   remainder = (a1 % 10 + b1 % 10 + remainder) / 2;
   a1 = a1 / 10;
   b1 = b1 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }
  return binary_prod_result;
 }
 }