public class Driver {
  public static void main(String[] args) {
    Thing1 thing1 = new Thing1();
    Thing2 thing2 = new Thing2();
    Printable printable; 

    System.out.println( thing1.print() ); 
    System.out.println( thing1.print( true ) ); 
    System.out.println( thing1.print( "CS11FZZ" ) ); 
    System.out.println( thing2.print() ); 
    System.out.println( thing2.print( true ) ); 
    System.out.println( thing2.print( "CS11FZZ" ) ); 
    printable = thing1;
    System.out.println( printable.print() ); 
    System.out.println( printable.print( true ) ); 
    System.out.println( printable.print( "CS11FZZ" ) ); 
    printable = new Thing2();
    System.out.println( printable.print() ); 
    System.out.println( printable.print( false ) ); 
    System.out.println( printable.print( "CS11FZZ" ) ); 
  }
}
