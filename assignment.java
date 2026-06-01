import java.util.Scanner;
class assignment
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int a = 10;
System.out.println("Enter the number:");
int b = sc.nextInt();
System.out.println("a+b:"+(a+=b));
System.out.println("a-b:"+(a-=b));
System.out.println("a*b:"+(a*=b));
System.out.println("a/b:"+(a/=b));
System.out.println("a%b:"+(a%=b));
}
}
