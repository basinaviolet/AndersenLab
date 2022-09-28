import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box appleBox1 = new Box();
        appleBox1.addFruit(new Apple("apple1"));
        appleBox1.addFruit(new Apple("apple2"));
        appleBox1.addFruit(new Orange("orange"));

        Box appleBox2 = new Box();
        appleBox2.addFruit(new Apple("apple3"));
        appleBox2.addFruit(new Apple("apple4"));
        appleBox2.addFruit(new Apple("apple5"));

        Box orangeBox1 = new Box();
        orangeBox1.addFruit(new Orange("orange1"));
        orangeBox1.addFruit(new Orange("orange2"));
        orangeBox1.addFruit(new Orange("orange3"));

        Box orangeBox2 = new Box();
        orangeBox2.addFruit(new Orange("orange4"));
        orangeBox2.addFruit(new Orange("orange5"));

        //get weights of boxes
        System.out.printf("appleBox1 weight = %.1f %n", appleBox1.getWeight());
        System.out.printf("appleBox2 weight = %.1f %n", appleBox2.getWeight());
        System.out.printf("orangeBox1 weight = %.1f %n", orangeBox1.getWeight());
        System.out.printf("orangeBox2 weight = %.1f %n", orangeBox2.getWeight());

        //compare weights of boxes
        System.out.printf("is the weight of appleBox1 adn appleBox2 equal: %b %n", appleBox1.compare(appleBox2));
        System.out.printf("is the weight of appleBox1 adn orangeBox1 equal: %b %n", appleBox1.compare(orangeBox1));
        System.out.printf("is the weight of appleBox2 adn orangeBox2 equal: %b %n", appleBox2.compare(orangeBox2));

        //pour from box and get there new weight
        appleBox1.pourBox(appleBox2);
        System.out.printf("appleBox1 weight = %.1f %n", appleBox1.getWeight());
        System.out.printf("appleBox2 weight = %.1f %n", appleBox2.getWeight());

        appleBox1.pourBox(orangeBox1);
        System.out.printf("appleBox1 weight = %.1f %n", appleBox1.getWeight());
        System.out.printf("orangeBox1 weight = %.1f %n", orangeBox1.getWeight());
    }

}
