import java.util.*;

class EvenOdd{

    public static void evenOdd(int num){

        if (num %2==0){
        System.out.println(num +" is a Even");

        }
        else{
        System.out.println(num +" is a Odd");

        }
    }
    public static void main(String args[]){

        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number to Check Even or Odd");
        num=sc.nextInt();

        evenOdd(num);
    }
}