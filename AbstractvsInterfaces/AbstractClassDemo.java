abstract class Dinosaur
{
    public void dino()
    {
        System.out.println("I am a Dinosaur");
    }

    abstract public void food();
    abstract public void legs();
}

class Trex extends Dinosaur
{
    @Override
    public void food()
    {
        System.out.println("I am a carnivore!");
    }

    @Override
    public void legs()
    {
        System.out.println("I have two legs");
    }
}

class Triceratops extends Dinosaur
{
    @Override
    public void food()
    {
        System.out.println("I am a herbivore!");
    }

    @Override
    public void legs()
    {
        System.out.println("I have four legs");
    }
}

public class AbstractClassDemo
{
    public static void main(String[] args)
    {
        Dinosaur trex = new Trex();
        trex.dino();
        System.out.println("I am a Tyrannousaurus");
        trex.food();
        trex.legs();

        System.out.println(" ");

        Dinosaur tric = new Triceratops();
        tric.dino();
        System.out.println("I am a Triceratops");
        tric.food();
        tric.legs();
    }
}