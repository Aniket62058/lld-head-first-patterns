public class Main {
    public static void main(String args[]) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedheadDuck();
        Duck duck3 = new RubberDuck();
        Duck duck4 = new DecoyDuck();

        duck1.display();
        duck2.display();
        duck3.display();
        duck4.display();

        System.out.println();

        duck1.performQuack();
        if(duck2 instanceof Quackable) ((Quackable) duck2).quack();
        if(duck3 instanceof Quackable) ((Quackable) duck3).quack();
        if(duck4 instanceof Quackable) ((Quackable) duck4).quack();

        System.out.println();

        duck1.swim();
        duck2.swim();
        duck3.swim();
        duck4.swim();

        System.out.println();

        duck1.performFly();
        if(duck2 instanceof Flyable) ((Flyable) duck2).fly();
        if(duck3 instanceof Flyable) ((Flyable) duck3).fly();
        if(duck4 instanceof Flyable) ((Flyable) duck4).fly();

    }
}
