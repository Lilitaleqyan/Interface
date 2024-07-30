class Triangle implements  Shape{

    @Override
    public int getArea() {
        return 30;
    }
}
class Rectangle  implements  Shape

{

    @Override
    public int getArea() {
        return 40;
    }
}
class Circle  implements  Shape{

    @Override
    public int getArea() {
        return 0;
    }
}
interface Shape {
    int getArea();
}

public class Main {
    public static void main(String[] args) {
     Triangle triangle=new Triangle();
     Rectangle rectangle=new Rectangle();
     Circle circle=new Circle();
     System.out.println(triangle.getArea());
     System.out.println(rectangle.getArea());
     System.out.println(circle.getArea());
    }
}