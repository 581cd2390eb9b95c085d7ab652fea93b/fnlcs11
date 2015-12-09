public class Question5 {
  public static void main( String[] args )
  {
    final int MAX = 7, MIN = 2;
    int i = 2, j = 5;
    while ( i < MAX )
    {
      while ( j >= MIN )
      {
        --j;
        System.out.println( i + " " + j );
        j -= 2;
      }
      j = i;
      i++;
    }
    System.out.println( i + " " + j );
  } 
}
