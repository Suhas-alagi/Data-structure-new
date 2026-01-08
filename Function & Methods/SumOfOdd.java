import java.util.*;

class SumOfOdd{

    public static void sumOfOdd(int n){
        int sum=0;
        for(int i = 1;i<=n;i++){

            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of odd Numbers from 1 to "+n+" is " + sum);
    }

    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        n=sc.nextInt();

        sumOfOdd(n);

    }
}