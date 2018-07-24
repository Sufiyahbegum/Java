import java.util.Scanner;
public class comp {
 public static void main( String args[] )    
    {
        // create Scanner to obtain input from command window       
        Scanner input = new Scanner(System.in);
        int a,b;      
        System.out.print( "Enter first integer: " );     
        a = input.nextInt();
 
        System.out.print( "Enter second integer: " );         
        b = input.nextInt();         
        
        if ( a == b )           
            System.out.printf( "%d == %d\n", a, b );  
        if ( a != b )          
            System.out.printf( "%d != %d\n", a, b );  
        if ( a < b )          
            System.out.printf( "%d < %d\n", a, b );  
        if ( a > b )          
            System.out.printf( "%d > %d\n", a, b );  
        if ( a <= b )          
            System.out.printf( "%d <= %d\n", a, b );  
        if ( a >= b )          
            System.out.printf( "%d >= %d\n", a, b );  
    }
  }