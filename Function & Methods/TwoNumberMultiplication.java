import java.util.*;

class TwoNumberMultiplication{
    public static int Product(int a,int b){

        int product=a*b;

        return product;
    }

    public static void main(String args[]){

        int a,b;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number a & b");
        a=sc.nextInt();
        b=sc.nextInt();

        int c = Product(a,b);

        System.out.println(c);




    }

}