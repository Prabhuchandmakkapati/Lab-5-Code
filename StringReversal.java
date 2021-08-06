import java.util.Scanner;
public class StringReversal
{
void reverseString(String s)
{
if ((s==null)||(s.length() <= 1))
System.out.println(s);
else
{
System.out.print(s.charAt(s.length()-1));
reverseString(s.substring(0,s.length()-1));
}
}
public static void main(String[] args)
{ Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
String s = sc.nextLine();
StringReversal obj = new StringReversal();
obj.reverseString(s);
}   
}