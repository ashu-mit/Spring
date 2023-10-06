package example;

public class Ram implements Action{

    @Override
    public void eat() {
        System.out.println("Ram is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Ram is sleep");
    }
    public Ram()
    {
        System.out.println("Ram Object is created");
    }
}
