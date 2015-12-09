public class Test14 {
  public static void main( String[] args ) {
    Animal a;
    a = new Lion();
    System.out.println( a + " says " + a.speak() );
    a = new BigTiger();
    System.out.println( a + " says " + a.speak() );
    a = new Cat();
    System.out.println( a + " says " + a.speak() );
    a = new Tiger( "Zach" );
    System.out.println( a + " says " + a.speak() );
    a = new BigTiger( "Katherine" );
    System.out.println( a + " says " + ((Cat) a).speak( "Big" ) );
  }
} 
