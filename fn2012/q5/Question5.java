public class Question5 {

  public static void f5( int a, int b )
  {
    if ( (a > 0) && (b > 0) )
    {
      if ( a > b )
      {
        System.out.println( "A" );
      }
      else
      {
        System.out.println( "B" );
      }
    }
    else if ( (a < 0) || (b < 0) )
    {
      System.out.println( "C" );
    }
    else
    {
      System.out.println( "D" );
    }
  }

  public static void main(String[] args) {
    f5(1, 3);
  }
}
