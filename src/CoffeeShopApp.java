public class CoffeeShopApp {
    public static void main(String[] args) {

        CoffeeOrderFacade orderFacade = new CoffeeOrderFacade();

        orderFacade.orderCoffee(true, true, false);
        orderFacade.orderCoffee(false, false, true);
    }
}
