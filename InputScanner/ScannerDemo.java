import java.util.Scanner;

public class ScannerDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = input.nextLine();
        input.nextLine();

        System.out.print("Enter your age: ");

        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your gender: ");
        
        char gender = input.next().charAt(0);
        input.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}