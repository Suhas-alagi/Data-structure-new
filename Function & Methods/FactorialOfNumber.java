import java.util.*;

class FactorialOfNumber{

    public static int Factorial(int num){

        int fact=1;
        
        for(int i =1;i<=num;i++){

            fact=fact*i;
        }

        return fact;


    }


    public static void main(String args[]){

        int  num;
        int call;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();

        call=Factorial(num);
        System.out.println(call);

    }
}