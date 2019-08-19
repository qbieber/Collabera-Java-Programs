final class noInheritance{}

public class FinalClass extends noInheritance
{
    public static void main(String[] args)
    {
        System.out.println("This won't ever print");
    }
}