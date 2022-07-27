class Array2d
{
public static void main(String args[])
{
int twod[][]=new int[12][10];
for(int i=0;i<12;i++)
{
for(int j = 0; j< 10; j++)
{
twod[i][j]=i+j;
}
}					
for(int i=0;i<twod.length;i++)
for(int j=0;i<twod.length;j++)
{
System.out.println("item at "+i+j+" is "+twod[i][j]);
}
}
}