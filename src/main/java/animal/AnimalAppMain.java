package animal;

public class AnimalAppMain {
    public static void main(String[] args) {
        Cat catBarsic = new Cat("Barsic");
        Cat catPushok = new Cat("Pushok");
        Dog dogRax = new Dog("Rax");

        System.out.println("Animals: " + Animal.counter
                + ", cats: " + Cat.counter
                + ", dogs: " + Dog.counter);

        catBarsic.run(100);
        catBarsic.swim(9);
        catPushok.run(0);
        catPushok.run(300);
        dogRax.run(300);
        dogRax.run(600);
        dogRax.swim(10);
        dogRax.swim(20);
        dogRax.run(-10);
        dogRax.run(0);
    }
}
