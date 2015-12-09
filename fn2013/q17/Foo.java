public class Foo
{
  public Foo()
  {
    this( 42, 420 );
    System.out.println( "Foo ctor #1" );
  }
  public Foo( int x, int y )
  {
    System.out.println( "Foo ctor #2" );
  }
  public String toString()
  {
    System.out.println( "Foo" );
    return "Foo.toString";
  }
} 
