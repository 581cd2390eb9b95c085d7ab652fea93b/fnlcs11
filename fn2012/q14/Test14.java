public class Test14 {
  public static void main( String[] args ) {
    Animal a;
    a = new Cat();
    System.out.println( a + " says " + a.speak() );
    a = new Lion();
    System.out.println( a + " says " + ((Lion) a).softer() );
    a = new BigTiger();
    System.out.println( a + " says " + a.speak() );
    a = new Tiger( "Max" );
    System.out.println( a + " says " + a.speak() );
    a = new BigTiger( "Zach" );
    System.out.println( a + " says " + ((Cat) a).speak( "Big" ) );
  }
} 
