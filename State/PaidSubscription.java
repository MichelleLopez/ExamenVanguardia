
public class PaidSubscription implements SubscriberState {
    
    @Override
    public void action(Subscriber subscriber) {
        subscriber.watchContent();
        subscriber.paySubscription();
        subscriber.cancelSubscription();
    }
}
