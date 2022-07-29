import java.util.Scanner;
public class HelloWorld
{
public static void main(String args[])
{   	
Scanner scanner=new Scanner(System.in);
int i=1;
int enternumber=1;
while(enternumber>=1 && enternumber<10)
{
System.out.println("enter any number between 1to9");	
enternumber =scanner.nextInt();
for(int j=0;j<i;j++)
{
System.out.println("Hello world");
}
i++;
}
System.out.println("Bye Bye");
}
}