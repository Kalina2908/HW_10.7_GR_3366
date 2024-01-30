public class App {
    //public static void main(String[] args) throws Exception {
    //    System.out.println("Hello, World!");
    //}

    public static void main(String[] args) {
        Logger logger = new Logger();
        Calculator calculator = new Calculator(logger);

        ComplexNumber a = new ComplexNumber(6, 8);
        ComplexNumber b = new ComplexNumber(5, 4);

        calculator.add(a, b);
        calculator.multiply(a, b);
        calculator.divide(a, b);
    }
}
