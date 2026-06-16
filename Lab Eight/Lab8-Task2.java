class shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class circle extends shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class rectangle extends shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class labrptt8 {
    public static void main(String[] args) {
        shape myShape = new shape();
        shape myCircle = new circle();
        shape myrectangle = new rectangle();

        myShape.draw();
        myCircle.draw();
        myrectangle.draw();
    }
}