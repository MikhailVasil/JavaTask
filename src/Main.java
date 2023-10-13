import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Lenovo", "Silver",true, 16, 500);
        Laptop laptop2 = new Laptop("Apple", "Silver", true,8, 250);
        Laptop laptop3 = new Laptop("Sony", "Blue", true,16, 250);
        Laptop laptop4 = new Laptop("HP", "Black", true,16, 350);
        Laptop laptop5 = new Laptop("Apple", "Gold", true,8, 250);
        Laptop laptop6 = new Laptop("Lenovo", "Silver", false,16, 500);

        Set<Laptop> laptops = new HashSet<>(List.of(laptop4, laptop1, laptop2, laptop3, laptop5, laptop6));
        System.out.println(laptops);
    }
}