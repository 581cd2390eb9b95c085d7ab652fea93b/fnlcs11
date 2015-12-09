class Rain extends Snow
{
  public void method1()
  {
    System.out.println("Rain 1");
    method3();
  }
  public void method2()
  {
    super.method2();
    System.out.println("Rain 2");
    method3();
  }
} 
