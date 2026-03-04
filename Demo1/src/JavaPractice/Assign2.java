public class Assign2 {
    public static void main(String[] args) {
        int a = 12;
        int b = 14;
        int c= a+b;
        System.out.println("Enter the number of first number : "+ a);
        System.out.println("Enter the number of second number : "+b);
        System.out.println("Sum of 2 numbers :" + add(a,b));
        System.out.println("diff of 2 numbers :" + sub(a,b));
        System.out.println("product of 2 numbers :" + mul(a,b));
        System.out.println("quotient of 2 numbers :" + div(a,b));
        System.out.println(Assign2.values("a","b"));
      //  System.out.println(Assign2.values1("a","b"));


    }
        public static int add ( int a, int b){
            int sum = a + b;
            return sum;
        }

        public static int sub ( int a, int b){
            int c = a - b;
            return c;
        }

        public static int mul ( int a, int b){
        int c = a * b;
            return c;
        }

        public  static int div ( int a, int b){
        int c = a/b;
            return c;
        }

        public static String values(String a, String b){
            String values = "a"+"b";
             return "5"+"6";
        }
   // public static int values1(int a, int b){
      //  int values1 = a+b;
       // return 5+6;
}

