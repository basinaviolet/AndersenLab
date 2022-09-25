package animal;

public class Dog extends Animal{
    final int LIMIT_RUN = 500;
    final int LIMIT_SWIM = 10;
    public static int dogCounter;

    public Dog(String name) {
              super(name);
        dogCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= LIMIT_RUN) {
            super.run(distance);
        }else {
            System.out.println(super.getName() + ": " + distance + " is an impossible distance for dogs to run");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= LIMIT_SWIM) {
            super.swim(distance);
        }else {
            System.out.println(super.getName() + ": " + distance + " is an impossible distance for dogs to swim");
        }
    }
}
