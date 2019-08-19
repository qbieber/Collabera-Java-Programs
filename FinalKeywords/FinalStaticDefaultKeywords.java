interface keywords
{
    default void defMet()
    {
        System.out.println("This is from the default method.");
    }

    abstract void abMet();

    static void statMet()
    {
        System.out.println("This is from the static method");
    }
}

class KeywordClass implements keywords
{
    public void abMet()
    {
        System.out.println("This is from the abstract method");
    }

    //Cannot be overridden
    final void finMet()
    {
        System.out.println("This is from the final method");
    } 
}

public class FinalStaticDefaultKeywords extends KeywordClass
{
    /*void finMet()
    {
        System.out.println("Cannot override final method");
    }*/

    public static void main(String[] args)
    {
        keywords.statMet();
        KeywordClass fsdkey = new KeywordClass();

        fsdkey.defMet();
        fsdkey.finMet();
        fsdkey.abMet();
    }
}