public class Tricky
{
  public static void main( String[] args )
  {
    System.out.println( "I" );
    message1( "Java" );
    System.out.println( "II" );
    message2( "Finals" );
    System.out.println( "III" );
    message3( "Fall" );
  }
  public static void message1( String s )
  {
    System.out.println( s + "-0" );
  }
  public static void message2( String s )
  {
    System.out.println( s + "-1" );
    message1( s + "-2" );
    System.out.println( s + "-3" );
  }
  public static void message3( String s )
  {
    System.out.println( s + "-4" );
    message2( s + "-5" );
    System.out.println( s + "-6" );
  }
}
