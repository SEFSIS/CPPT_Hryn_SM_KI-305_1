package KI305.Hryn.Lab4;

import java.io.*;
import java.util.*;
public class FioApp {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
// TODO Auto-generated method stub
        CalcWFio obj = new CalcWFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        obj.calculate(data);
        System.out.println("Result is: " + obj.getResult());
        obj.writeResTxt("textRes.txt");
        obj.writeResBin("BinRes.bin");
        obj.readResBin("BinRes.bin");
        System.out.println("Result is: " + obj.getResult());
        obj.readResTxt("textRes.txt");
        System.out.println("Result is: " + obj.getResult());
    }
}
