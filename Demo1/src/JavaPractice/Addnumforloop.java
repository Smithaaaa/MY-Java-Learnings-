public class Addnumforloop {
    public static void main(String[] args) {
        int n=9;
        int sum=0;
        for(int i=0;i<=n;i++){

            sum=sum+i;
            System.out.println("Adding 2 numbers" +" "+ i + "is :" +sum );
        }
        System.out.println("Sum of all numbers" +" "+ n + "is :" +sum );
    }
}
