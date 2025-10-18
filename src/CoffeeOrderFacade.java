public class CoffeeOrderFacade {
    public void orderCoffee(boolean milk, boolean sugar, boolean caramel) {
        Coffee coffee = new BasicCoffee();
        if (milk) {
            coffee = new MilkDecorator(coffee);
        }
        if (sugar) {
            coffee = new SugarDecorator(coffee);
        }
        if (caramel) {
            coffee = new CaramelDecorator(coffee);
        }
        System.out.println("Your order:" + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());
        pay(coffee.getCost());
        System.out.println("Your order completed!");
    }
    private void pay(double amount) {
        System.out.println("Processing payment of $" + amount + "...");
        System.out.println("Payment successful!");
    }
}
