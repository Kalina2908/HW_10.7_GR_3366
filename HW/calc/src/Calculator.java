public class Calculator {
    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.add(b);
        logger.log("Adding " + a + " and " + b + " resulted in " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.multiply(b);
        logger.log("Multiplying " + a + " and " + b + " resulted in " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = a.divide(b);
        logger.log("Dividing " + a + " by " + b + " resulted in " + result);
        return result;
    }
}
