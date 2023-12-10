package lab10.FactoryMethodPattern;

public abstract class Logistics {
    abstract public Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
