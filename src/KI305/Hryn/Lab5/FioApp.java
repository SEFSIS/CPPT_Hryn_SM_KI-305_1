package KI305.Hryn.Lab5;
import java.io.*;
import java.util.*;

/**
 * The FioApp class provides a simple application to test the CalcWFio class.
 */
public class FioApp {
    /**
     * The main method of the application.
     *
     * @param args The command-line arguments (not used in this application).
     * @throws FileNotFoundException If a file is not found.
     * @throws IOException           If an I/O error occurs.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        CalcWFio obj = new CalcWFio(); // Create an instance of CalcWFio

        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble(); // Read input data from the user

        obj.calculate((int) data); // Calculate the result based on the input data
        System.out.println("Result is: " + obj.getResult()); // Display the result to the console

        obj.writeResTxt("textRes.txt"); // Write the result to a text file
        obj.writeResBin("BinRes.bin"); // Write the result to a binary file
        obj.readResBin("BinRes.bin"); // Read the result from the binary file
        System.out.println("Result is: " + obj.getResult()); // Display the result from the binary file

        obj.readResTxt("textRes.txt"); // Read the result from the text file
        System.out.println("Result is: " + obj.getResult()); // Display the result from the text file
    }
}
