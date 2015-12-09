public class Fubar extends Foo
{
  public Fubar( int x, int y, int z )
  {
    super( x, y );
    System.out.println( "Fubar ctor #1" );
  }
  public Fubar( int x, int y )
  {
    this ( x, y, 42 );
    System.out.println( "Fubar ctor #2" );
  }
  public Fubar()
  {
    this( 4, 2 );
    System.out.println( "Fubar ctor #3" );
  }
  public String toString()
  {
    String s = super.toString() + " + " +
      "Fubar";
    System.out.println( s );
    return "Fubar.toString";
  }
} 
