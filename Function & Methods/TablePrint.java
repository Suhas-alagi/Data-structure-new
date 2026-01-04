import java.util.*;

class TablePrint{

    public static void evenOdd(int num){

        System.out.println("Table of "+ num);
        for(int i =1;i<=10;i++){

            int table=num*i;

            System.out.println("\t"+table);
        }

    }

    public static void main(String args[]){

        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to Print Table");
        num=sc.nextInt();

        evenOdd(num);
    }
}