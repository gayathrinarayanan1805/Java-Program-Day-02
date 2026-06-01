import java.util.Scanner;
class average
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int v1 = sc.nextInt();
System.out.println("Enter second number:");
int v2 = sc.nextInt();
System.out.println("Enter third number:");
int v3 = sc.nextInt();
int avg = (v1+v2+v3)/3;
System.out.println("The average of the numbers "+v1+","+v2+","+v3+" is "+avg);
}
}