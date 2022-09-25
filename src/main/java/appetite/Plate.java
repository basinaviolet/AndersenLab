package appetite;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    /* Decreasing of food in the plate.
     * if the required amount of food n is enough, return true;
     * if the required amount of food n is less than necessary, an error message is printed and return false.
     */
    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            System.out.println("Error: there`re only " + food + " pieces. It`s not enough for your appetite " + n);
            return false;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    /* Increasing of food in the plate.
     * if the added amount of food n is less than 0, an error message is printed
     */
    public void plateFill (int n) {
        if (n >= 0) {
            food += n;
            System.out.println(n + " was added to the plate");
        } else {
            System.out.println("Error: there`re not enough food for filling");
        }
    }
}
