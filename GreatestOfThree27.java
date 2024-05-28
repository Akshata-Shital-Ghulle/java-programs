public class GreatestOfThree27 {

  public static void main(String[] args) {
    int num1 = 20;
    int num2 = 3;
    int num3 = 1;

    int largest = num1; 

    if (num2 > largest) { 
      largest = num2; 
    }
    if (num3 > largest) { 
      largest = num3; 
    }

    System.out.println("The largest number is: " + largest);
  }
}
