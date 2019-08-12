import java.util.Scanner;

public class InputValidation
{
    public static void main(String[] args)
    {
        Scanner usrin = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 100: ");
        
        int number = usrin.nextInt();
        while(number < 0 || number > 100)
        {
            System.out.print("You must eneter a number bewteen 0 and 100. Try again: ");
            number = usrin.nextInt();
        }
        System.out.println("You enetered: " + number);
    }
}