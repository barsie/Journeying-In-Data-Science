package SmallPrograms;

import java.util.Scanner;

public class FizzBuzzDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        // int fizz = number % 5;
        // int buzz = number % 3;

        // Remove DRY Here!
        if (number % 3 == 0 && number % 5 == 0) {
           System.out.println("FizzBuzz"); 
        } 
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 3 == 0){
            System.out.println( "Buzz");
        } 
        else{
            System.out.println(number);
        }

       
    }
}
