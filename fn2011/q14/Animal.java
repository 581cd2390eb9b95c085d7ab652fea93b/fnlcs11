abstract class Animal {
  private String name;
  public Animal() { this( "Animal" ); }
  public Animal( String name ) { this.name = name; }
  public String toString() { return this.name; }
  public abstract String speak();
} 
