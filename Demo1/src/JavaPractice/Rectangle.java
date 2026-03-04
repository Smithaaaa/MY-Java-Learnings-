public class Rectangle {

    private static int length;
    private static int breadth;
    private static int perimeter;
    private static int area;

    Rectangle(int p, int a){
       length = p;
       breadth = a;
    }

    public static int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public static void display(){
        perimeter = 2 * (length + breadth);
        area = length * breadth;
    }

}
