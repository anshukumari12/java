class AreaOfShape
{
double pi=3.14;
public void area(int a)
{

System.out.println("area of sqaure= "+(a*a));
}

public void area(int a,int b)
{
System.out.println("area of rectangle= "+(a*b));

}
public void area(double r)
{
System.out.println("area of circle= "+(pi*r*r));
}

public static void main(String args[])
{
AreaOfShape obj =new AreaOfShape();
obj.area(4);
obj.area(5,3);
obj.area(2.0);
}
}
