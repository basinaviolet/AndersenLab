package animal;

/* Instead of this kind of implementation of Animal class, an abstract class could be used.
 * In this case, run and swim methods would be implemented directly in the cat and dog classes.
 */
public class Animal {
    private String name;
    public static int animalCounter;

    public Animal() {
        animalCounter++;
    }

    public Animal(String name) {
        this.name = name;
        animalCounter++;
    }

    public void run(int distance){
        System.out.println(name + " ran " + distance + "m");
    }
    public void swim(int distance){
        System.out.println(name + " swam " + distance + "m");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
