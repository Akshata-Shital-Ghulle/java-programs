import java.util.Scanner;
public class FactorialCalculator44
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter a number to calculate its factorial");
int number=scanner.nextInt();
long factorial=1;
for(int i=1;i<=number;i++)
{
factorial=factorial*i;
}
System.out.println("factorial of "+number+" is:"+factorial);
scanner.close();
}
}

