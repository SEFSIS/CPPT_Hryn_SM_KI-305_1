package KI305.Hryn.Lab5;

/**
 * The CalcException class is a custom exception class that extends ArithmeticException.
 * It is used to handle exceptions related to equation calculations in the Equations class.
 */
class CalcException extends ArithmeticException
{
    /**
     * Default constructor for CalcException.
     */
    public CalcException(){}

    /**
     * Constructor for CalcException with a custom error message.
     *
     * @param cause A string describing the cause of the exception.
     */
    public CalcException(String cause)
    {
        super(cause);
    }
}
