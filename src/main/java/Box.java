import java.util.ArrayList;

public class Box<T> {

    private ArrayList<T> fruitSet = new ArrayList<T>();

    public Box() {
    }

    /* Adding new fruit to the box
     * return true if all ok;
     * if the type of fruit doesn`t match return the error
     */
    public boolean addFruit(T fruitItem) {
        if (this.fruitSet.size() > 0) {
            if (fruitSet.get(0).getClass().equals(fruitItem.getClass())) {
                fruitSet.add(fruitItem);
                return true;
            } else {
                System.out.println("Error: the box has other kind of fruit");
                return false;
            }
        } else {
            fruitSet.add(fruitItem);
            return false;
        }
    }

    /* clearing a fruit box
     * return true if all ok;
     * return false if box is empty
     */
    public boolean delFruit() {
        if (this.fruitSet.size() > 0) {
            fruitSet.clear();
            return true;
        } else {
            return false;
        }
    }

    /* comparing weights of fruit boxes
     * the method accepts a box for comparing
     * return true if weight is the same;
     * return false if weight is different
     */
    public boolean compare(Box boxForCompare) {
        return boxForCompare.getWeight() == this.getWeight();
    }

    public float getWeight() {
        if (fruitSet.size() > 0) {
            switch (fruitSet.get(0).getClass().getName()) {
                case ("Apple"):
                    Apple appleItem = (Apple) fruitSet.get(0);
                    return fruitSet.size() * appleItem.getFruitWeight();
                case ("Orange"):
                    Orange orangeItem = (Orange) fruitSet.get(0);
                    return fruitSet.size() * orangeItem.getFruitWeight();
                default:
                    return 0;
            }
        }
        return 0;
    }

    /* pouring fruits from the another box to this box
     * the method accepts a box from which fruits are poured
     * return true if all ok;
     * return false if the type of fruit doesn`t match
     */
    public boolean pourBox(Box boxWithFruit) {
        for (int i = 0; i < boxWithFruit.fruitSet.size(); i++) {
            if (!this.addFruit((T) boxWithFruit.fruitSet.get(i))) {
                System.out.println("Error: you are trying to pour fruit into a box with other kind of fruit");
                return false;
            }
        }
        return boxWithFruit.delFruit();
    }

}
