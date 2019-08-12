import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner usrin = new Scanner(System.in);
        System.out.println("Enter name, age, and gender: ");

        String name = usrin.nextLine();

        int age = usrin.nextInt();

        char gender = usrin.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}