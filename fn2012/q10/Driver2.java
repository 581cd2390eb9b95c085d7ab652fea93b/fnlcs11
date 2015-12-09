public class Driver2 {
  public static void main(String[] args) {

    Snow ref1;

    ref1 = new Rain();
    ((Rain) ref1).method1();
    System.out.println( "-----" );
    ref1.method2();
    System.out.println( "-----" );
    ref1.method3(); 
  }
}
