import java.util.Scanner;
public class RelationalOperators1{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("Enter first number:");
int num1=s1.nextInt();
System.out.println("Enter second number:");
int num2=s1.nextInt();
System.out.println("Enter third number:");
int num3=s1.nextInt();
if((num1>num2)&&(num1>num3))
{
if (num2>num1)
{
System.out.println("greater number is:"+num2);
}
else
{
System.out.println("greater number is:"+num3);
}
}
if((num2>num1)&&(num2>num3))
{
if(num2>num1)
{
System.out.println("greater number is:"+num2);
}
}
else{
System.out.println("greater number is:"+num1);
}
}
}




