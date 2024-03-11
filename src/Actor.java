public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrderStatus;
    protected boolean isTakeOrderStatus;

    abstract String getName();
}