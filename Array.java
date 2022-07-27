class Array
{
public static void main(String args[])
{
int array[]=new int[15];
for(int i=0;i<array.length;i++)
{
array[i]=i;
}
array[6]=40;
for(int i=0;i<array.length;i++)
{
System.out.println("item at"+i+"is"+array[i]);
}
}
}