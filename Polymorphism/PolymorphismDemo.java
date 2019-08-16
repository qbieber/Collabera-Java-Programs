class DoAddition
{
    public void add(int num1, int num2)
    {
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

    public void add(String word1, String word2)
    {
        String concat = word1 + word2;
        System.out.println(word1 + " + " + word2 + " = " + concat);
    }
}

public class PolymorphismDemo extends DoAddition
{
    public static void main(String[] args)
    {
        DoAddition adding = new DoAddition();
        adding.add(8, 7);
        adding.add("Base", "ball");
    }
}