import java.util.*;
class reverse
{
public static void main(String args[])
{
int rev,num,d;
Sytem.out.println("enter number to reverse");
Scanner sc=new Scanner(System.in);
num=sc.newint();
while(num>0)
{
d=num%10;
rev=(rev*10)+d;
num=num/10;
}
}
}
