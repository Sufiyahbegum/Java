import java.util.Scanner;
public class biadd {
 public static void main(String[] args)
 {
  long a, b;
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Input first binary number: ");
  a = in.nextLong();
  System.out.print("Input second binary number: ");
  b = in.nextLong();

  while (a != 0 || b != 0) 
  {
   sum[i++] = (int)((a % 10 + b % 10 + remainder) % 2);
   remainder = (int)((a % 10 + b % 10 + remainder) / 2);
   a = a / 10;
   b = b / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) 
  {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}