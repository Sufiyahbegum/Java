public class mulop
{
   public static void main(String args[])
   {
      int a,b,c,d,e,f;
      System.out.println("Enter the two numbers ");
      
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      b = in.nextInt();
      c = a + b;
      
      d = a - b;
      
      e = a * b;
      
      f = a / b;
      System.out.println("Sum of entered numbers = "+c);
      System.out.println("Difference of entered numbers = "+d);
      System.out.println("Product of entered numbers = "+e);
      System.out.println("Division value of entered numbers = "+f);
   }
}