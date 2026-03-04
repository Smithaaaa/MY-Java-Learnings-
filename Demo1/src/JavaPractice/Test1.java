public class Test1 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);

        System.out.println(r.getPerimeter());
        System.out.println(r.getArea());
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        r.display();
    }
}
