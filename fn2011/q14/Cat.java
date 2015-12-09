class Cat extends Animal {
  public Cat() { this( "Ko Ko" ); }
  public Cat( String name ) { super( name + " Cat" ); }
  public String speak() { return "Meow"; }
  public String speak( String name ) { return name + " Meow"; }
} 
