
/*
interface Drawable{
    public void draw();
}
class Prac1{
    public static void main(String[] args) {
        int length=5;
        Drawable d = new Drawable() {

            @Override
            public void draw() {
            System.out.println("Drawable" +"  " +length);
              }
            };

        d.draw();
    }

}*/
class prac1{

    String studentName ;
    int rollnum;
    static String collegeName = "DBIT";

    prac1(String r, int n){

         studentName = r;
        rollnum = n;

    }

    void display()

    {
        System.out.println("Display the details :" +studentName + " " +rollnum +" " +collegeName);
    }

    public static void main(String[] args) {
        prac1 pp = new prac1("Ram",111);
        prac1 pp1 = new prac1("sham",222);
        pp.display();
        pp1.display();
    }
}