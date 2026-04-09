public class Abstract {
    public static void main(String[] args){
    
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4);
        Rectangle rectangle = new Rectangle(6,8);

        circle.display();
        System.out.println("Circle area: " + circle.area());
        triangle.display();
        System.out.println("Triangle area: " + triangle.area());
        rectangle.display();
        System.out.println("Rectangle area: " + rectangle.area());

}
}

 abstract class Shape{

    abstract double area();

    void display(){
        System.out.println("This is a shape");
    }
}

 class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI*radius*radius;
    }

}

 class  Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area(){
        return 0.5*base*height;
    }

}

class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length*width;
    }

}