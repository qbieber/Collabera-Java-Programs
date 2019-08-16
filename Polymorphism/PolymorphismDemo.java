class DoAddition
{
    public int add(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    public String add(String word1, String word2)
    {
        String concat = word1 + word2;
        return concat;
    }
}

public class PolymorphismDemo extends DoAddition
{
    public static void main(String[] args)
    {
        DoAddition adding = new DoAddition();
        System.out.println("8 + 7 = " + adding.add(8, 7));
        System.out.println("Base + ball = " + adding.add("Base", "ball"));
    }
}