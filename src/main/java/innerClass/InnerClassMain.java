package innerClass;

public class InnerClassMain {
    public static void main(String[] args){
        Park myPark = new Park();
        myPark.setParkName("My Park");
        myPark.setAttraction("Swings", 5, 1);
        myPark.setAttraction("Carousels", 3, 3);
        myPark.setAttraction("Ferris wheel", 15, 10);
        myPark.setAttraction("Roller coaster", 10, 15);
        myPark.setAttraction("Fear room", 13, 13);

        System.out.println(myPark.getParkName() + ":");
        for (Park.Attraction attractionItem: myPark.getAllAttraction()){
            System.out.println(attractionItem.toString());
        }

        System.out.println("--------------------");
        Payment myBill = new Payment();
        myBill.setCustomerName("Violeta");
        myBill.setAccount("111111ABC");
        myBill.setPurchase("Nice dress", 1, 100.0, 1234);
        myBill.setPurchase("Java book", 1, 10.0, 4444);
        myBill.setPurchase("Brie cheese", 5, 5.0, 1111);
        myBill.setPurchase("Wine", 2, 25.0, 7777);

        System.out.println(myBill.toString());
        for (Payment.Purchase billItem: myBill.getPurchaseSet()){
            System.out.println(billItem.toString());
        }
    }
}
