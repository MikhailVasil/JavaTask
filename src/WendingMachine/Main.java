package WendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink drink1 = new HotDrink("Cappuccino", 200, 0.3 , 70);
        HotDrink drink2 = new HotDrink("Cappuccino", 250, 0.4,70);
        HotDrink drink3 = new HotDrink("Americano", 200, 0.5,78);
        HotDrink drink4 = new HotDrink("Tea", 200, 0.5,85);
        HotDrink drink5 = new HotDrink("Espresso", 100, 0.2,78);
        HotDrink drink6 = new HotDrink("Espresso", 150, 0.3,78);

        VendingMachineHotDrink vendingMachineHotDrink = new VendingMachineHotDrink(
                new ArrayList<>(List.of(drink1,drink2,drink3,drink4,drink5,drink6)));
        System.out.println(vendingMachineHotDrink.getProduct("Tea", 0.5, 85));


    }
}
