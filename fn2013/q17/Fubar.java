public class Fubar extends Foo
{
  public Fubar( int x, int y, int z )
  {
    this();
    System.out.println( "Fubar ctor #1" );
  }
  public Fubar( int x, int y )
  {
    this( x, y, 4200 );
    System.out.println( "Fubar ctor #2" );
  }
  public Fubar()
  {
    System.out.println( "Fubar ctor #3" );
  }
  public String toString()
  {
    System.out.println( "Fubar" );
    String s = "Fubar" + " + " +
      super.toString();
    return s;
  }
}
