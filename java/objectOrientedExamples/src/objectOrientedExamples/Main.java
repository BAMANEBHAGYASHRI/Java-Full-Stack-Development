package objectOrientedExamples;

class Shapes {
    void draw() {
        System.out.println("We can Draw the shapes");
    }
}

class Circle extends Shapes {
    void draw() {
        System.out.println("Drawing the circle");
    }
}

class Rectangle2 extends Shapes {
    void draw() {
        System.out.println("Drawing the rectangle");
    }
}

class Triangle extends Shapes {
    void draw() {
        System.out.println("Drawing the triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle2();
        shapes[2] = new Triangle();

        for (Shapes shape : shapes) {
            shape.draw();
        }
    }
}
