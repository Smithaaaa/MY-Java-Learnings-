class Shape{

    String color ="White";
    public void display(){
        System.out.println("Display Shape");
    }
}

class Square extends Shape{

    String color ="Blue";
    public void Square(){

        System.out.println(color);
        System.out.println(super.color);
        System.out.println("Square is displayed");

    }
}

class Triangle  extends Shape{
    public void Triangle(){
        System.out.println("Triangle is displayed");

    }
}

public class Assign17 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.display();
        System.out.println("==========================");
        Square s1 = new Square();
        s1.display();
        s1.Square();
        System.out.println("==========================");
        Triangle t = new Triangle();
        t.display();
        t.Triangle();

    }
}
