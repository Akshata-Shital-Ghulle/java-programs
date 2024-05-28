class CustomException extends Exception
{
public CustomException(String message)
{
super(message);
}
}
public class CustomExceptionExample
{
public static void main(String[] args)
{
try
{
throw new CustomException("this is a custom exception");
}
catch(CustomException e)
{
System.out.println("Custom Exception caught:"+e.getMessage());
}
}
}
