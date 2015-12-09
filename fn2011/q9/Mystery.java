public class Mystery
{
  public static void main( String[] args )
  {
    Mystery ref = new Mystery();
    System.out.println( ref.mystery( 6 ) );
  }
  public int mystery( int a )
  {
    int b = a - 3;
    int c = a + 5;
    if ( b > 0 )
    {
      System.out.println( a + " " + b + " " + c );
      c = b + mystery( --a );
      System.out.println( a + " " + b + " " + c );
    }
    else
    {
      c = a - b;
      System.out.println( "Whoa!" );
      System.out.println( a + " " + b + " " + c );
    }
    return c;
  }
} 
