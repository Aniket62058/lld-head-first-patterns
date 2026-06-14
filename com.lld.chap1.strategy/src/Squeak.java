public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println(getClass().getSimpleName() + " squeak");
    }
}
