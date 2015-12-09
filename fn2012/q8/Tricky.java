public class Tricky
{
  public static void main( String[] args )
  {
    foo1();
    System.out.println( "main1" );
    foo2();
    System.out.println( "main2" );
    foo3();
    System.out.println( "main3" );
  }
  public static void foo1()
  {
    System.out.println( "A" );
  }
  public static void foo2()
  {
    System.out.println( "B" );
    foo3();
    System.out.println( "C" );
  }
  public static void foo3()
  {
    System.out.println( "D" );
    foo1();
    System.out.println( "E" );
  }
}
