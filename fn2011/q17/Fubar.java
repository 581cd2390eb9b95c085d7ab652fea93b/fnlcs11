public class Fubar
{
  public Fubar( int x, int y )
  {
    System.out.println( "Fubar ctor #1" );
  }
  public Fubar()
  {
    this( 10, 20 );
    System.out.println( "Fubar ctor #2" );
  }
  public String toString()
  {
    System.out.println( "Fubar.toString" );
    return "Fubar.toString";
  }
}
