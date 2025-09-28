package solidPrinciple.interfaceSegrigationPrinciple.violate;
interface RestaurantEmployee {
    void prepareFood();
    void decideMenu();
    void serveFoodAndDrinks();
    void takeOrder();
    void cleanTheKitchen();
}

//BAD: This class violates iSP(clients shouldn't depend on unused interfaces)
//Bloated class with empty or error-throwing methods
//This Waiter is forced to implement methods it doesn't need
class Waiter implements RestaurantEmployee {
    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("waiter cannot clean the kitchen!");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Serving the food and drinks");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("waiter can't decide menu");
    }

    @Override
    public void prepareFood() {
        throw new AssertionError("waiter can't prepare food");
    }
}

public class ViolateISP {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        //These will throw exceptions
        waiter.prepareFood();
        waiter.decideMenu();
        waiter.cleanTheKitchen();
    }
}
