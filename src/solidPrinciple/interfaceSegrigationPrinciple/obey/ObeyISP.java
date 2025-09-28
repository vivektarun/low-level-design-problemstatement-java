package solidPrinciple.interfaceSegrigationPrinciple.obey;

interface ChefTasks {
    void prepareFood();
    void decideMenu();
}

interface WaiterTask {
    void serveFoodAndDrinks();
    void takeOrder();
}

interface MaintenanceTasks {
    void cleanTheKitchen();
    void reStockGroceries();
}

class Chef implements ChefTasks {
    @Override
    public void decideMenu() {
        System.out.println("chef can decide menu");
    }

    @Override
    public void prepareFood() {
        System.out.println("Chef can prepare food");
    }
}

class Waiter implements WaiterTask {
    @Override
    public void takeOrder() {
        System.out.println("waiter can take order");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("waiter can serve food and drinks");
    }
}

//Every thing is segregated now.
public class ObeyISP {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        chef.prepareFood();
        chef.decideMenu();

        waiter.serveFoodAndDrinks();
        waiter.takeOrder();
    }
}
