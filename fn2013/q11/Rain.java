class Rain extends Snow
{
  public void method1()
  {
    method3();
    System.out.println("Rain 1");
  }
  public void method2()
  {
    method3();
    System.out.println("Rain 2");
    super.method2();
  }
} 
