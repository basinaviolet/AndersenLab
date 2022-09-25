package innerClass;

import java.text.DecimalFormat;
import java.util.ArrayList;

// Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
public class Park {

    private String parkName;
    private ArrayList<Attraction> attraction = new ArrayList<>();

    public ArrayList<Attraction> getAllAttraction() {
        return attraction;
    }

    /* Add new attraction to the list of park`s attractions
     *
     */
    public void setAttraction(String attractionName, int time, double price) {
        this.attraction.add(new Attraction(attractionName, time, price));
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    /* Class for attractions
     *
     */
    public class Attraction {
        String attractionName;
        int time;
        double price;

        public Attraction(String attractionName, int time, double price) {
            this.attractionName = attractionName;
            this.time = time;
            this.price = price;
        }

        @Override
        public String toString() {
            return attractionName
                    + " [work time: " + time
                    + ", price: " + new DecimalFormat("#0.00").format(price)
                    + "]";
        }
    }
}

