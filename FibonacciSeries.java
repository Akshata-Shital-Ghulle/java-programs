public class FibonacciSeries
{
public static void main(String[] args)
{
int terms=10;
System.out.println("fibonacci series up to" +terms+ "terms");
int a=0,b=1;
for(int i=0;i<terms;i++)
{
System.out.print(a+"  ");
int sum=a+b;
a=b;
b=sum;
}
}
}


//Output
fibonacci series up to10terms
0  1  1  2  3  5  8  13  21  34