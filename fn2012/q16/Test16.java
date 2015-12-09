 public class Test16
 {
   private int a;
   private int b;
   private static int c = 7;
   public static void main( String[] args )
     {
       Test16 ref = new Test16( 3 );
       ref.method1( ref.b );
      }
  public Test16( int a )
    {
      this.a = a;
      }
  public void method1( int x )
    {
      int c = x;
      int b;
      b = a;
      a = c;
      System.out.println( "this.a = " + this.a );
      System.out.println( "this.b = " + this.b );
      System.out.println( "Test16.c = " + Test16.c );
      System.out.println( "c = " + c );
      System.out.println( "b = " + b );
      System.out.println( "a = " + a );
      System.out.println( "result = " + method2( a ) );
      System.out.println( "this.a = " + this.a );
      System.out.println( "this.b = " + this.b );
      System.out.println( "Test16.c = " + Test16.c );
      System.out.println( "x = " + x );
      System.out.println( "a = " + a );
      System.out.println( "b = " + b );
      System.out.println( "c = " + c );
      }
  private int method2( int x )
    {
      int b = x;
      int c = this.b + Test16.c;
      x = a = b + c;
      System.out.println( "this.a = " + this.a );
      System.out.println( "this.b = " + this.b );
      System.out.println( "Test16.c = " + Test16.c );
      System.out.println( "x = " + x );
      System.out.println( "a = " + a );
      System.out.println( "b = " + b );
      System.out.println( "c = " + c );
      Test16.c = c + 2;
      this.a = a + c;
      return x + 5;
      }
  }
