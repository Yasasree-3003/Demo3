import java.util.Scanner;
import java.io.*;
class Addition{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int num1=s1.nextInt();
int num2=s1.nextInt();
int sum=0;
//Displaying num1 and num2
//System.out.println("num1="+num1);
//System.out.println("num2="+num2);
sum=num1+num2;
System.out.println(num1 + "+" + num2 + "=" +sum);
}
}



