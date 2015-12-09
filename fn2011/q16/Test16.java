 public class Test16
  2 {
     3 private int a;
      4 private static int b = 3;
       5 private int c;
        6 public static void main( String[] args )
           7 {
              8 Test16 ref = new Test16( 4 );
               9 ref.method1( ref.a );
               10 }
        11 public Test16( int a )
          12 {
            13 this.a = a;
            14 }
        15 public void method1( int x )
          16 {
            17 int c = x--;
            18 int b;
            19 b = a + 2;
            20 a = c + 3;
            21 System.out.println( "this.a = " + this.a );
            22 System.out.println( "Test16.b = " + Test16.b );
            23 System.out.println( "this.c = " + this.c );
            24 System.out.println( "c = " + c );
            25 System.out.println( "b = " + b );
            26 System.out.println( "a = " + a );
            27 System.out.println( "result = " + method2( b + c ) );
            28 System.out.println( "this.a = " + this.a );
            29 System.out.println( "Test16.b = " + Test16.b );
            30 System.out.println( "this.c = " + this.c );
            System.out.println( "x = " + x );
            System.out.println( "a = " + a );
            System.out.println( "b = " + b );
            System.out.println( "c = " + c );
            }
        private int method2( int x )
          {
            int b = x;
            int c = this.c + Test16.b;
            x = a = b + c;
            System.out.println( "this.a = " + this.a );
            System.out.println( "Test16.b = " + Test16.b );
            System.out.println( "this.c = " + this.c );
            System.out.println( "x = " + x );
            System.out.println( "a = " + a );
            System.out.println( "b = " + b );
            System.out.println( "c = " + c );
            Test16.b = b + 2;
            this.c = a + c;
            return x + 5;
            }
         }
