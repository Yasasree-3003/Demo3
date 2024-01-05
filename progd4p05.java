//java program to Illustrate Unary not Operator
import java.util.Scanner;
class Test17{
public static void main(String args[])
{
boolean cond=true;
Scanner s1=new Scanner(System.in);
int a=s1.nextInt();
int b=s1.nextInt();
//int a=10,b=1;
System.out.println("Cond is:"+cond);
System.out.println("Var1 is:"+a);
System.out.println("Var2 is:"+b);
System.out.println("Now Cond is:"+!cond);
System.out.println("!(a<b):"+!(a<b));
System.out.println("!(a>b):"+!(a>b));
}
}

