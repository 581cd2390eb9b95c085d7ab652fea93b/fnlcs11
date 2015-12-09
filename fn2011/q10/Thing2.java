class Thing2
{
  private int count;

  public Thing2( int count )
  {
    this.count = count;
  }
  public int getCount()
  {
    return this.count;
  }
  public void setCount( int count )
  {
    this.count = count;
  }
  public String toString()
  {
    String s = " ";
    switch( this.count )
    {
      case 1:
        s = s + "first ";
      case 2:
        s = s + "mid ";
        break;
      case 3:
        s = s + "last ";
        break;
      default:
        s = s + "rest ";
        break;
    }
    return s;
  }
  public void swap1( Thing2 t2 )
  {
    int temp;
    temp = this.getCount();
    this.setCount( t2.getCount() );
    t2.setCount( temp );
  }
  public void swap2( Thing2 t2 )
  {
    Thing2 temp;
    Thing2 t1 = this;
    temp = t1;
    t1 = t2;
    t2 = temp;
  }
} 
