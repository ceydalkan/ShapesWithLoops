import java.util.Scanner;

public class Loops {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        hourglassLoop();
    }

    public static void identityMatrix() {
        System.out.print("Welcome,please enter a number: ");
        int numberOfLoops = s.nextInt();
        int numberOfFirstZeros = 0;
        int numberOfSecondZeros = numberOfLoops - 1;

        for (int i = 1; i <= numberOfLoops; i++) {
            for (int j = 1; j <= numberOfFirstZeros; j++)
                System.out.print("0");
            System.out.print("1");
            for (int k = 1; k <= numberOfSecondZeros; k++)
                System.out.print("0");
            numberOfFirstZeros++;
            numberOfSecondZeros--;
            System.out.println();
        }
    }

    public static void productLoop() {
        for (int factor1 = 8; factor1 <= 12; factor1 = factor1 + 2) {
            for (int factor2 = 2; factor2 <= 6; factor2++) {
                System.out.println(factor1 + " x " + factor2 + " = " + factor1 * factor2);
            }
        }
    }

    public static void hourglassLoop() {
        int numberOfRows = 9;

        // the first half
        for (int i = 0; i <= numberOfRows / 2; i++) {
            // spaces
            for (int numberOfSpaces = 0; numberOfSpaces < i; numberOfSpaces++)
                System.out.print(" ");

            // numbers
            for (int printedNumber = i + 1; printedNumber <= numberOfRows - i; printedNumber++)
                System.out.print(printedNumber);

            System.out.println();
        }

        // the second half
        int numberOfSpaces = 3;
        int leadingNumber = 4;

        for (int i = 1; i <= numberOfRows / 2; i++) {
            // spaces
            int printedSpaces = numberOfSpaces;
            while (printedSpaces > 0) {
                System.out.print(" ");
                printedSpaces--;
            }

            // numbers
            int printedNumber = leadingNumber;
            while (printedNumber <= numberOfRows - numberOfSpaces) {
                System.out.print(printedNumber);
                printedNumber++;
            }

            numberOfSpaces--;
            leadingNumber--;
            System.out.println();
        }
    }
}
