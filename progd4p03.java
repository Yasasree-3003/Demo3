//Write a program to print Ascii value of given input
import java.util.Scanner;
class Test15{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
int asciivalue=c;
if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
System.out.println(asciivalue);
}
}
}

