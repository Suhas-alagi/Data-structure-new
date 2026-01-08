import java.util.*;

class GreatestNumber{

    public static void greatestNumber(int a,int b,int c){

        if(a>b && a>c){

            System.out.println(a +" is Greater");
        }
        else if(b>a && b>c){

            System.out.println(b +" is Greater");
        }
        else{
            System.out.println(c +" is Greater");

        }
    }
        public static void main (String args[]){

            int a,b,c;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Value of first No");
            a=sc.nextInt();
            System.out.println("Enter a Value of Second No");
            b=sc.nextInt();
            System.out.println("Enter a Value of Third No");
            c=sc.nextInt();


            greatestNumber(a,b,c);
        }
    
}