abstract class Shape implements Cloneable {
    protected String type;
    abstract void draw();
    public String getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}



class Circle extends Shape {
    @Override

    void draw() {
        System.out.println("Circle created");
    }
}



class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square created");
    }
}



class Test4 {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape Square1 = new Square();
        circle1.draw();
        Square1.draw();
        Circle circle2 = (Circle) circle1.clone();
        Square Square2 = (Square) Square1.clone();
        circle2.draw();
        Square2.draw();
    }
}
