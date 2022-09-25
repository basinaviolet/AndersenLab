package appetite;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    /* Getting cat`s satiety
     *
     */
    public boolean getSatiety() {
        System.out.println(name + "`s satiety: " + satiety);
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }
}
