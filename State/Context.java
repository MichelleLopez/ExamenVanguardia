
public class Context {
    private SubscriberState state = null;
    private Subscriber subscriber = new Subscriber();

    public void setState(SubscriberState state) {
        this.state = state;
    }

    public void action() {
        state.action(subscriber);
    }
}
