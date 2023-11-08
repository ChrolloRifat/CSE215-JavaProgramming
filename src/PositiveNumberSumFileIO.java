/*Java program to take integers from the user
* and write them into a file until the user inputs
* a negative number, and then read the file and
* print the sum and average of the numbers
*/
import java.io.*;
import java.util.Scanner;

public class PositiveNumberSumFileIO {
    public static void main(String[] args) throws IOException {
    	 // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a file writer to write the integers to a file
        FileWriter fileWriter = new FileWriter("/home/rif/eclipse-workspace/CSE215-JavaProgramming/src/integer.txt");

        // Prompt the user to enter integers
        System.out.println("Enter integers, one per line, and enter a negative number to stop:");

        // Read integers from the user until a negative number is entered
        int integer;
        do {
            integer = scanner.nextInt();
            if (integer >= 0) {
                fileWriter.write(integer + "\n");
            }
        } while (integer >= 0);

        // Close the file writer
        fileWriter.close();

        // Create a new Scanner object to read the integers from the text file
        Scanner fileScanner = new Scanner(new FileReader("/home/rif/eclipse-workspace/CSE215-JavaProgramming/src/integer.txt"));

        // Print the readed values from the text file
        while (fileScanner.hasNextInt()) {
            int value = fileScanner.nextInt();
            System.out.println(value);
        }

        FileReader fileReader = new FileReader("/home/rif/eclipse-workspace/CSE215-JavaProgramming/src/integer.txt");
        try {
        	 BufferedReader bufferedReader = new BufferedReader(fileReader);
             int sum = 0, count = 0;
             String line;
             while ((line = bufferedReader.readLine()) != null) {
                 sum += Integer.parseInt(line);
                 count++;
             }


            // Check if the count variable is zero
            if (count > 0) {
                // Calculate the average of the integers
                double average = sum / count;

                // Print the sum and average of the integers
                System.out.println("Sum of integers: " + sum);
                System.out.println("Average of integers: " + average);
            } else {
                // Print a message indicating that there are no integers in the file
                System.out.println("There are no integers in the file.");
            }
            bufferedReader.close();
        } catch (ArithmeticException e) {
            // Handle the ArithmeticException error
            System.out.println("There are no integers in the file.");
        }

        // Close the file scanner
        fileScanner.close();
        fileReader.close();
    }
}
