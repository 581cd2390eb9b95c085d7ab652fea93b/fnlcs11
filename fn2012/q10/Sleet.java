class Sleet extends Snow
{
  public void method2()
  {
    super.method2();
    System.out.println("Sleet 2");
    method3();
  }
  public void method3()
  {
    super.method3();
    System.out.println("Sleet 3");
  }
} 
