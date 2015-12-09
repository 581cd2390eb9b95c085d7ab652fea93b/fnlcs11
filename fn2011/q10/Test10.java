public class Test10
{
  public static void main( String[] args )
  {
    Thing2 first = new Thing2( 1 );
    Thing2 second = new Thing2( 2 );
    Thing2 temp = second;
    second = first;
    first = temp;
    System.out.println( first.toString() );
    System.out.println( second.toString() );
    Thing2 third = new Thing2( 3 );
    Thing2 fourth = new Thing2( 4 );
    third.swap1( fourth );
    System.out.println( third.toString() );
    System.out.println( fourth.toString() );
    second.setCount( fourth.getCount() );
    third = first;
    System.out.println( third == first );
    System.out.println( fourth == second );
    System.out.println( first.toString().equals( third.toString() ) );
    System.out.println( second.toString().equals( fourth.toString() ) );
    System.out.println( first.toString() );
    System.out.println( second.toString() );
    System.out.println( third.toString() );
    System.out.println( fourth.toString() );
    first = new Thing2( 1 );
    second = new Thing2( 2 );
    first.swap2( second );
    System.out.println( first.toString() );
    System.out.println( second.toString() );
  }
}
