public class Overloading75
{
public static void print(int num)
{
System.out.println("printing integer"+num);
}
public static void print(double num)
{
System.out.println("printing double"+num);
}
public static void print(String str)
{
System.out.println("printing string"+str);
}
public static void print(char ch)
{
System.out.println("printing character:"+ch);
}
public static void main(String[] args)
{
print(10);
print(3.14);
print("hello World");
print('A');
}
}
