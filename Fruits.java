class Fruits
{	
String sName;
String colour;
String session;
  public Fruits()
{
System.out.println("fruits is=");
}
public Fruits(String sName,String colour,String session)
{
	sName=sName;
	this.colour=colour;
}
public Fruits(Fruits variable)
{
	sName=variable.sName;
	colour=variable.colour;
}
	public static void main (String args[])
	{
Fruits Apple=new Fruits( );
System.out.println("Apple"  +Apple.sName);
System.out.println("Red"    +Apple.colour);
System.out.println("summer"    +Apple.session);
Fruits Mango=new Fruits("Mango","Green","summer");
//System.out.println("Mango"    +Mango.sName);
System.out.println("yellow"    +Mango.colour);
//System.out.println("summer"    +Mango.session);
Fruits Orange=new Fruits(Mango);
System.out.println("Orange"    +Orange.sName);
System.out.println("Orange"    +Orange.colour);
System.out.println("winter"    +Orange.session);
	}
}


