package customexception;

import java.util.Scanner;

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void displayAge() throws  MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        if(age<18){
            throw new MyException("You cannot vote!");
        }
        System.out.println("Age is:"+age);
    }

    public static void main(String[] args) {
       try{
           displayAge();
       }
       catch(MyException e){
           System.out.println("Message from exception:"+e.getMessage());
       }
       
       System.out.println("We are inside main method!");
    }

}
