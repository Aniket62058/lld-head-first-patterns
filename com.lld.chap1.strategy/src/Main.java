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

        duck1.quack();
        duck2.quack();
        duck3.quack();
        duck4.quack();

        System.out.println();

        duck1.swim();
        duck2.swim();
        duck3.swim();
        duck4.swim();

        System.out.println();

        duck1.fly();
        duck2.fly();
        duck3.fly();
        duck4.fly();

    }
}
