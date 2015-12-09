public class Test9
{
  public static void main( String[] args )
  {
    System.out.println( mystery( 6 ) ); // Print returned value
  }
  public static int mystery( int n )
  {
    int result;
    if ( n > 1 ) // A
    {
      result = 2 * n - 1 + mystery( n - 1 );
      System.out.println( n + ": " + result );
    }
    else // B
    {
      result = 1;
      System.out.println( n + ": " + result );
    }

    return result;
  }
} 
