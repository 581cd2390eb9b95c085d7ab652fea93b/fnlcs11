public class Foo extends Fubar
{
  public Foo( int x, int y, int z )
  {
    this( x, y );
    System.out.println( "Foo ctor #1" );
  }
  public Foo( int x, int y )
  {
    super();
    System.out.println( "Foo ctor #2" );
  }
  public Foo()
  {
    this( 4, 2, 0 );
    System.out.println( "Foo ctor #3" );
  }
  public String toString()
  {
    System.out.println( "Foo.toString" + " + "
        + super.toString() );
    return "Foo.toString";
  }
} 
