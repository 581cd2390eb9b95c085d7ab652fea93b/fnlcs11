public class Number6
{
  public static void main( String[] args )
  {
    int[] array = { 35, 95, 125, 105, 125, 105, 65, 35, 95, 65 };
    int a = 42, b = 0;
    for ( int i = 0; i < array.length; ++i )
    {
      int foo = array[i];
      if ( foo > a ) // line that changes in questions below
      {
        a = foo;
        b = i;
      }
    }
    System.out.println(a + ", " + b); // separate the value of a and b with a comma and space
  }
} 
