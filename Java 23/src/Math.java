class Const implements Expression {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x) {
        return value;
    }
}

class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int x) {
        // Имя переменной игнорируется, используется переданное значение x
        return x;
    }
}

class Add extends BinaryOperation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) + right.evaluate(x);
    }
}

class Subtract extends BinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}

class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}

class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        int divisor = right.evaluate(x);
        if (divisor != 0) {
            return left.evaluate(x) / divisor;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}
