import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNum = scanner.nextInt();
	int reversedNum = 0;
        int number=1234;
        number= originalNum;
	while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number/= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(number+ " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
