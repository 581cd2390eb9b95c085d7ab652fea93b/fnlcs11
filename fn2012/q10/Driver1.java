public class Driver1 {
  public static void main(String[] args) {
    Snow ref1;

    ref1 = new Fog();
    ((Fog) ref1).method1();
    System.out.println( "-----" );
    ref1.method2();
    System.out.println( "-----" );
    ref1.method3(); 
  }
}
