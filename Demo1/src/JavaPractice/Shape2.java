public class Shape2 implements Shapes,Shapes1{

    public void print(){
        System.out.println("Printing");
    }

    @Override
    public void Draw() {
        System.out.println("Drawing");
    }

    public static void main(String[] args) {
        Shape2 s2 = new Shape2();
        s2.print();
        s2.Draw();
    }

}
