public class StringReversal83
{
public static String reverseString(String str)
{
if(str==null||str.isEmpty())
{
return str;
}
StringBuilder reversed=new StringBuilder();
for(int i=str.length()-1;i>=0;i--)
{
reversed.append(str.charAt(i));
}
return reversed.toString();
}
public static void main(String[] args)
{
String inputString="hello,World!";
String reversedString=reverseString(inputString);
System.out.println("original string"+inputString);
System.out.println("reversed string"+reversedString);
}
}


