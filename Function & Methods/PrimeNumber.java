import java.util.*;
class PrimeNumber{

    public static void primeNumber(int num){

        int num1=num/2;
        int count=0;

        for(int i =1;i<=num1;i++){

            if (num % i==0){

                count++;
            } 

        }
        if (count==1){

            System.out.println(num +" is a Prime Number");
        }
        else{
            System.out.println(num +" is a Prime Not a Number");

        }
        

    }

    public static void main(String args[]){

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check Prime or Not");
        num=sc.nextInt();

        primeNumber(num);
    }
}