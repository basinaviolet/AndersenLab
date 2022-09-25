package appetite;

public class AppetiteMain {
    public static void main(String[] args) {
        Cat[] catArray = {
                new Cat("Barsic", 20),
                new Cat("Pushok", 10),
                new Cat("Zhora", 50),
                new Cat("Lapa", 5),
                new Cat("Kuzma", 30)
        };
        Plate plate = new Plate(100);

        plate.info();
        for (Cat catItem : catArray) {
            catItem.eat(plate);
        }
        plate.info();
        for (Cat catItem : catArray) {
            catItem.getSatiety();
        }

// an additional task with filling the cat's plate, I couldn`t leave the kitties without food.
        plate.plateFill(40);
        plate.info();
        for (Cat catItem : catArray) {
            catEatProcessWithAdd(catItem, plate);
        }
    }

    // process of cats eating and filling the plate by cat`s appetite if there`re food not enough
    public static void catEatProcessWithAdd(Cat catItem, Plate plateItem) {
        catItem.eat(plateItem);
        if (!catItem.getSatiety()) {
            plateItem.plateFill(catItem.getAppetite());
            plateItem.info();
            catItem.eat(plateItem);
            catItem.getSatiety();
            plateItem.info();
        } else {
            plateItem.info();
        }
    }

}
