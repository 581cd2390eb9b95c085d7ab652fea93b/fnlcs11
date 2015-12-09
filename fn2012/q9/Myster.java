public class Mystery
{
  public static void main( String[] args )
  {
    Mystery ref = new Mystery();
    System.out.println( ref.mystery( 7 ) );
  }
  public int mystery( int a )
  {
    int b = a - 3;
    int c = a + 3;
    if ( b > 1 )
    {
      System.out.println( a + " " + b + " " + c );
      c = a + mystery( b + 2 );
      System.out.println( a + " " + b + " " + c );
    }
    else
    {
      c = a + b;
      System.out.println( "Stop!" );
      System.out.println( a + " " + b + " " + c );
    }
    return c;
  }
}
