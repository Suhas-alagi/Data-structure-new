import java.util.*;
class NamePrint{

    public static void namePrint(String name){    //defination of function

        System.out.println(name);
        return;

    } 

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Your Name");
        String name=sc.next();   //input from user

        namePrint(name); //function calling
    }
}