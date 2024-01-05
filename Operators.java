import java.util.Scanner;
 public class Operators{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("enter the first num:");
int num1=s1.nextInt();
System.out.println("enter the second num:");
int num2=s1.nextInt();
double sum=num1+num2;
double sub=num1-num2;
double mul=num1*num2;
double div=num1/num2;
double mod=num1%num2;
System.out.println(num1 + "+" + num2 + "=" +sum);
System.out.println(num1 + "-" + num2 + "=" +sub);
System.out.println(num1 + "*" + num2 + "=" +mul);
System.out.println(num1 + "/" + num2 + "=" +div);
System.out.println(num1 + "%" + num2 + "=" +mod);
}
}