package animal;

public class Cat extends Animal{
    final  int LIMIT_RUN = 200;
    public static int counter;

    public Cat(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= LIMIT_RUN) {
            super.run(distance);
        }else {
            System.out.println(super.getName() + ": " + distance + " is an impossible distance for cats to run");
        }
    }

    @Override
    public void swim(int distance) {
            System.out.println(super.getName() + ": " + "Cats can`t swim");
    }
}
