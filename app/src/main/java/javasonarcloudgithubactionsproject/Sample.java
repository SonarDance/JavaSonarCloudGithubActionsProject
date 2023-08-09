package javasonarcloudgithubactionsproject;

import java.util.Scanner;

public class Sample {

    private static void sayHello(){
        System.out.println("Hello");
    }

    private static int returnNumber(int number){
        return number*number;
    }

    public static void main(String[] args) {
        System.out.println("This is a sample java file");
        sayHello();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        sc.close();
        int userNumberInput = Integer.parseInt(userInput);
        int returnedNumber = returnNumber(userNumberInput);
        System.out.println("Returned number is: " + returnedNumber);
        sayHello();
    }
}
