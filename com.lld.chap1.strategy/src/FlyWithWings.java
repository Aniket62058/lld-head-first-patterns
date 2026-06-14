public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " fly with wings.");
    }
}
