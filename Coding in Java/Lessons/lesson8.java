import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // the scanner method work with datatypes and have to be specified
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are: " + age + " years old");

        System.out.print("name: ");
        /*this next method only count one token: that is a character or series of characters*/
        String name = scanner.next();

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println(fullName);
        
    }
}
