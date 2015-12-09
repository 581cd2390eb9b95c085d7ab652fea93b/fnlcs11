public class Driver {
  public static void main(String[] args) {
    Thing1 thing1;
    Thing2 thing2;
    Doable doable; 


    thing1 = new Thing1(); 
    thing1.speak(); 
    thing1.doit(); 
    thing1.speak( " Mine" ); 
    String s1 = Thing1.SPEAK; 
    thing2 = new Thing2(); 
    thing2.speak(); 
    thing2.doit(); 
    thing2.speak( " Mine" );


    String s2 = Thing2.SPEAK; 
    doable = new Thing1(); 
    doable.speak(); 
    doable.doit(); 
    doable = thing2; 
    doable.speak( " Mine" ); 
    doable.doit(); 
    thing1 = thing2; 
    thing1 = doable; 
    doable = new Doable(); 


  }
}
