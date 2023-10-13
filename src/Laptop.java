import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
public class Laptop {
    private String brand;
    private String color;
    private boolean os;
    private int ram;
    private int hdd;

    public Laptop(String brand, String color, boolean os, int ram, int hdd) {
        this.brand = brand;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return String.format("\nBrand = %s, color = %s, os = %s, ram = %d, hdd = %d ",
                brand, color, os, ram, hdd);

        }

    @Override
    public boolean equals(Object o) {
        Laptop laptop = (Laptop) o;
        return Objects.equals(brand, laptop.brand)
                && ram == laptop.ram
                && hdd == laptop.hdd;
        }
    @Override
    public int hashCode() {
        return (int) (this.brand.hashCode() + this.ram + this.hdd);
    }
}
