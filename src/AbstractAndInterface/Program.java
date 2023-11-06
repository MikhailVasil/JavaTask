package AbstractAndInterface;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Евгений");
        Human human2 = new Human("Микаел");
        Human human3 = new Human("Иван");
        market.acceptToMarket(human1);
        market.update();
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.update();

    }
}
