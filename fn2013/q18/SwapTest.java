public class SwapTest
{
  public static void main( String[] args )
  {
    int a = 42; Swap ref1;
    int b = 64; Swap ref2;
    ref1 = new Swap(7);
    ref2 = new Swap(2);
    ref2 = ref1.swap(ref2, a);
    System.out.println(ref1.getA()); 
    System.out.println(ref2.getA());
    ref1 = new Swap(7);
    ref2 = new Swap(2);
    ref1.setA(ref1.swap(ref2.getA()));
    System.out.println(ref1.getA()); 
    System.out.println(ref2.getA()); 
    ref1 = new Swap(7);
    ref2 = new Swap(2);
    Swap.swap(ref1, ref2);
    System.out.println(ref1.getA()); 
    System.out.println(ref2.getA()); 
    ref1 = new Swap(7);
    ref2 = new Swap(2);
    ref1.swap(a, b);
    System.out.println(a); 
    System.out.println(b);
    ref1 = new Swap(7);
    ref2 = new Swap(2);
    ref1.swap(ref2);
    System.out.println(ref1.getA()); 
    System.out.println(ref2.getA()); 
  }
} 
