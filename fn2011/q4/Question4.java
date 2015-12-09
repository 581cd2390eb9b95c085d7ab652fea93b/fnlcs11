public class Question4
{
  public static void main( String[] args )
  {
    final int MAX = 9, MIN = 3;
    int i = 6, j = 6;
    while ( i > MIN )
    {
      while ( j <= MAX )
      {
        --j;
        System.out.println( i + " " + j );
        j += 4;
      }
      i--;
      j = i;
    }
    System.out.println( i + " " + j );
  }
} 
