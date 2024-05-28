public class NumberReversal84
{
public static int reverseNumber(int number)
{
int reversedNumber=0;
while(number !=0)
{
int digit=number%10;
reversedNumber=reversedNumber*10+digit;
number/=10;
}
return reversedNumber;
}
public static void main(String[] args)
{
int inputNumber=12345;
int reversedNumber=reverseNumber(inputNumber);
System.out.println("original number"+inputNumber);
System.out.println("reversed Number"+reversedNumber);
}
}