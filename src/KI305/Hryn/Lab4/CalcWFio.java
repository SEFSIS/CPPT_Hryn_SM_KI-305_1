package KI305.Hryn.Lab4;

import java.io.*;
import java.util.Scanner;

/**
 * The CalcWFio class provides methods for performing calculations and file I/O operations.
 */
class CalcWFio {
    private double result; // Додали поле для результату

    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ", result);
        f.close();
    }

    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else
                throw new FileNotFoundException("File " + fName + " not found");
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    public double calculate(int x) throws CalcException {
        if (x == 0) {
            System.out.println("Error: X cannot be equal to 0.");
            return 0.0; // Повертаємо 0 у разі, якщо x=0
        }

        double rad = x * Math.PI / 180.0;
        try {
            result = 2 * x / Math.sin(rad);
            if (Double.isNaN(result) || Double.isInfinite(result) || x == 90 || x == -90)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0)
                throw new CalcException("Exception reason: Illegal value of X for sin calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return result;
    }

    public double getResult() {
        return result;
    }
}
