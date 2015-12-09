class BigTiger extends Tiger {
  public BigTiger() { super( "Brina" ); }
  public BigTiger( String name ) { super( name ); }
  public String speak() { return "Roar"; }
  public String speak( String name ) { return name + " Roar"; }
} 
