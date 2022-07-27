class Palindrome 
{
public static void main(String args[])
{
int reverse_number=0,r,temp;
int n=262;
temp=n;
while(n>0)
{
r=n%10;
reverse_number=(reverse_number*10+r);
n=n/10;
}
if(temp==reverse_number)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}

