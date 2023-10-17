package WendingMachine;

public class HotDrink extends Product {

    private int temp;

    public HotDrink(String name, double cost, double volume, int temp) {
        super(name, cost, volume);
        this.temp = temp;

    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + '\'' +
                ", volume=" + super.getVolume() + '\'' +
                ", temp=" + temp +
                '}';
    }
}
