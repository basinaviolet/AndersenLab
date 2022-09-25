package innerClass;

import java.util.ArrayList;

// Создать класс Payment с внутренним классом,
// с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Payment {

    private String customerName;
    private String account;
    private ArrayList<Purchase> purchaseSet = new ArrayList<>();

    /* Add new purchase to my bill
     *
     */
    public void setPurchase(String purchaseName, int count, double price, int purchaseId) {
        this.purchaseSet.add(new Purchase(purchaseName, count, price, purchaseId));
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ArrayList<Purchase> getPurchaseSet() {
        return purchaseSet;
    }

    @Override
    public String toString() {
        return customerName + "`s payment with account id = " + account + ":";
    }

    /* Class for purchases
     *
     */
    public class Purchase {
        String purchaseName;
        int count;
        double price;
        int purchaseId;

        public Purchase(String purchaseName, int count, double price, int purchaseId) {
            this.purchaseName = purchaseName;
            this.count = count;
            this.price = price;
            this.purchaseId = purchaseId;
        }

        @Override
        public String toString() {
            return purchaseName +
                    "[count: " + count +
                    ", price: " + price +
                    ", id: " + purchaseId
                    + "]";
        }
    }


}
