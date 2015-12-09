public class Question4
{
  public static void main( String[] args )
  {
    final int MAX = 7, MIN = 2;
    int i = 5, j = 3;
    while ( i >= MIN )
    {
      while ( j < MAX )
      {
        ++j;
        System.out.println( i + " " + j );
        j += 2;
      }
      j = i;
      i--;
    }
    System.out.println( i + " " + j );
  }
} 
