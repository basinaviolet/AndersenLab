package aliexpress;

public class MainAli {
    public static void main(String[] args) {
        AliMainForm aliMainPage = new AliMainForm();

        //--------- Aliexpress Tests-----------------------
        start(aliMainPage);
        aliMainPage.setSettings();
        System.out.println("settings check: " + aliMainPage.checkSettings());

        aliMainPage.search();
        System.out.println("searching check: " + aliMainPage.checkSearch());

        aliMainPage.addToCart();
        System.out.println("search item and add it to cart check: "
                + aliMainPage.checkCart("650ml Infuser Water Bottle Plastic"));
        end(aliMainPage);
    }

    public static void start(AliMainForm aliPage) {
        aliPage.setUp();
    }

    public static void end(AliMainForm aliPage) {
        aliPage.complete();
    }
}
