package WendingMachine;

import java.util.List;

public class VendingMachineHotDrink implements VendingMachine{
    List<HotDrink> hotDrinkList;

    public VendingMachineHotDrink(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public List<HotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

//    @Override
//    public Product getProduct(String name) {
//        for (HotDrink item : hotDrinkList) {
//            if(item.getName().equals(name))
//                return item;
//        }
//        return null;
//    }
//
//    @Override
//    public Product getProduct(String name, double temp) {
//        for (HotDrink cup: hotDrinkList) {
//            if(cup.getName().equals(name) && cup.getTemp() == temp)
//                return cup;
//        }
//        return null;
//    }

    @Override
    public Product getProduct(String name, double volume, int temp) {
        for (HotDrink cup: hotDrinkList) {
            if(cup.getName().equals(name) && cup.getTemp() == temp && cup.getVolume() == volume)
                return cup;
        }
        return null;
    }

    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinkList.add(hotDrink);
    }
}
