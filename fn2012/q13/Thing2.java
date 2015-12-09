public class Thing2 implements Doable
{
  public static final String SPEAK = "No, Me";
  public Thing2()
  {
    ctor initialization here
  }
  public String speak( String s )
  {
    return SPEAK + s;
  }
  public void doit()
  {
   // Thing2 does its thing
  }
} 
