public class Swap
{
  private int a;
  public int getA()
  {
    return a;
  }
  public void setA(int a)
  {
    this.a = a;
  }
  public Swap(int a)
  {
    this.a = a;
  }
  public int swap(int a)
  {
    this.a = a;
    return a;
  }
  public void swap(int a, int b)
  {
    int tmp;
    tmp = a;
    a = b;
    b = tmp;
  }
  public void swap(Swap ref)
  {
    Swap tmp;
    tmp = ref;
    ref.a = this.a;
    this.a = tmp.a;
  }
  public Swap swap(Swap ref, int a)
  {
    this.a = a;
    return ref;
  }
  public static void swap(Swap ref1, Swap ref2)
  {
    Swap tmp;
    tmp = ref1;
    ref1 = ref2;
    ref2 = tmp;
  }
}
