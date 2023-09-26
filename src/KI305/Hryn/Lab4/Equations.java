package KI305.Hryn.Lab4;

/**
 * The Equations class provides methods for calculating mathematical equations.
 */
public class Equations
{
    /**
     * Calculates the value of a mathematical equation based on the input parameter.
     *
     * @param x The input value in degrees.
     * @return The result of the equation.
     * @throws CalcException If an exception occurs during calculation.
     */
    public double calculate(int x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try
        {
            y = 2 * x / Math.sin(rad);
            if (Double.isNaN(y) || Double.isInfinite(y) || x == 90 || x == -90)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0)
                throw new CalcException("Exception reason: Illegal value of X for sin calculation");
            else if (x == 0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}