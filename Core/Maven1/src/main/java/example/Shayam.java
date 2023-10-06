package example;

public class Shayam implements Action{
    public Shayam()
    {
        System.out.println("Shayam Object is created");
    }
    @Override
    public void eat() {
        System.out.println("Shyam is eating");
    }

    @Override
    public void sleep() {
    System.out.println("Shyam is sleeping");
    }
}
