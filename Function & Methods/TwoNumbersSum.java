import java.util.*;

class TwoNumbersSum{
    public static int Sum(int a,int b){

        int sum=a+b;

        return sum;
    }

    public static void main(String args[]){

        int a,b;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number a & b");
        a=sc.nextInt();
        b=sc.nextInt();

        int c = Sum(a,b);

        System.out.println(c);




    }

}