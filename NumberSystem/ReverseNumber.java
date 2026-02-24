import java.util.Scanner;
class ReverseNumber{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rev=0;
        int num1;

        while(num != 0){
            num1=num %10;     //34   4 3
            rev= rev*10+num1;    // 43
            num/=10;
            
        }
        System.out.println(rev);
    }
}