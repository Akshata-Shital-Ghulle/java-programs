import java.util.Scanner;

public class scanner14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and display integer
        System.out.print("Enter an integer: ");
        int integerValue = scanner.nextInt();
        System.out.println("You entered integer: " + integerValue);

        // Read and display double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered double: " + doubleValue);

        // Read and display string
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("You entered string: " + stringValue);
         scanner.close();

}
}