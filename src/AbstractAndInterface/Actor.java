package AbstractAndInterface;

public abstract class Actor implements ActorBehaviour{
    protected final String name;
    protected boolean isMakeOrder; // Сделать заказ
    protected boolean isTakeOrder; // Получить заказ

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}
