import java.util.Scanner;
class Test20{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
System.out.println("YES");
}
else System.out.println("NO");
}
}