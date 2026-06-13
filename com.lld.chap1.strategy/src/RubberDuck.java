public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }

    @Override
    public void fly() {
    }

    public void quack() {
        System.out.println("RubberDuck squeak");
    }

}
