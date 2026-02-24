import java.util.Scanner;
class SumOfDigit{

    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        num=sc.nextInt();
        int count=0;

        int sum=0;

        //sum and count of num

        while(num!=0){

            sum=sum+(num%10);
            num=num/10;

            count++;
            
        }
        System.out.println(count);
        System.out.println("sum = "+sum);

    }
}