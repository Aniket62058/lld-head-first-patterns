public abstract class Duck {
    public void quack() {
        System.out.println(getClass().getSimpleName() + " Quacking");
    }

    public void swim() {
        System.out.println(getClass().getSimpleName() + " Swim");
    }

    public abstract void display();

    public void fly() {
        System.out.println(getClass().getSimpleName() + " fly");
    }
}
