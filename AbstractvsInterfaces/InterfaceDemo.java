interface dinosaur
{
    void dino();
    void period();
}

interface quadruped
{
    void legs();
}

interface biped
{
    void legs();
}

class Trex implements dinosaur, biped
{
    @Override
    public void dino()
    {
        System.out.println("I am a Tyrannosaurus");
    }

    @Override
    public void period()
    {
        System.out.println("I am from the Cretaceous period");
    }

    @Override
    public void legs()
    {
        System.out.println("I have two legs");
    }
}

class Stego implements dinosaur, quadruped
{
    @Override
    public void dino()
    {
        System.out.println("I am a Stegosaurus");
    }

    @Override
    public void period()
    {
        System.out.println("I am from the Jurassic period");
    }

    @Override
    public void legs()
    {
        System.out.println("I have four legs");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Trex trex = new Trex();
        Stego stego = new Stego();

        trex.dino();
        trex.period();
        trex.legs();

        System.out.println(" ");

        stego.dino();
        stego.period();
        stego.legs();
    }
}
