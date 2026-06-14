public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        System.out.println("I am Redhead Duck");
    }

    @Override
    public void fly() {
        System.out.println("RedheadDuck fly");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck quack");
    }
}
