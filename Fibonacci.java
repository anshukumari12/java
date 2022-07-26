class Fibonacci
{
public int factorial(int a,int b, int c)
{
for(i=0;i<10;i++)
{
c=a+b;
b=a;
a=c;
System.out.println("value of c="+c);
}
public static void main(String args[])
{
Fibonacci fib = new Fibonacci();
fib.factorial(1,1,1);
}
}
}
