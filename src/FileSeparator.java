import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {

        // Step 1: Separate numbers
        try {
            // Initialize Scanner for input file
            Scanner input = new Scanner(new File("numbers.txt"));

            // Initialize writers
            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");

            // Loop through numbers
            while (input.hasNextInt()) {
                int num = input.nextInt();

                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }

            // Close resources
            input.close();
            evenWriter.close();
            oddWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        // Step 2: Display even.txt
        System.out.print("Even File: ");
        try {
            Scanner evenReader = new Scanner(new File("even.txt"));
            while (evenReader.hasNextInt()) {
                System.out.print(evenReader.nextInt() + " ");
            }
            evenReader.close();
        } catch (FileNotFoundException e) {
            System.out.print("Error");
        }
        System.out.println();

        // Step 3: Display odd.txt
        System.out.print("Odd File: ");
        try {
            Scanner oddReader = new Scanner(new File("odd.txt"));
            while (oddReader.hasNextInt()) {
                System.out.print(oddReader.nextInt() + " ");
            }
            oddReader.close();
        } catch (FileNotFoundException e) {
            System.out.print("Error");
        }
        System.out.println();
    }
}