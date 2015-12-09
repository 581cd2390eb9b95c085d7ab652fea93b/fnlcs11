public class Question3 {
  public static void main(String[] args) {
    int a = 7, b = 5, c;
    boolean bool1 = !(b > 4) && (a <= 6) && (a <= 4) || !(b > 6);
    if ( ++a >= 4 && b-- >= 3 )
      c = a++ + --b;
    else
      c = ++a + b--; 

    int x = 7, y = 5, z;
    boolean bool2 = !((x > 4) || (y <= 6)) == ((y <= 4) && (x > 6));
    if ( x++ >= 4 || --y >= 3 )
      z = x++ + --y;
    else
      z = ++x + y--;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("bool1 = " + bool1 + "\n\n");

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    System.out.println("bool2 = " + bool2);

  }
}
