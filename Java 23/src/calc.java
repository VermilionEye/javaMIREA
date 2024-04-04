public class calc {
    public static void main(String[] args) {
        // Создание выражения x^2 - 2x + 1
        Expression expression = new Subtract(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(-1)
        );

        // Проверка значения выражения для x, переданного в командной строке
        if (args.length > 0) {
            try {
                int xValue = Integer.parseInt(args[0]);
                int result = expression.evaluate(xValue);
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for x. Please provide an integer.");
            }
        } else {
            System.out.println("Please provide a value for x in the command line.");
        }
    }
}
