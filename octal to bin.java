import java.util.Scanner;

public class octtobin {
public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);
  int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
  long octal, temp_octal, binary, place;
  int rem;
  System.out.print("Enter an octal number: ");
  octal = in.nextLong();
  temp_octal = octal;
  binary = 0;
  place = 1;
  while (temp_octal != 0)
  {
   rem = (int)(temp_octal % 10);
   binary = octal_numvalues[rem] * place + binary;
   temp_octal /= 10;
   place *= 1000;
  }
  System.out.print("Equivalent binary number to the given Octal number : " + binary+"\n");
 }
}