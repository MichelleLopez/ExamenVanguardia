
public class UnpaidSubscription implements SubscriberState{
    
    @Override
    public void action(Subscriber subscriber) {
        subscriber.paySubscription();
        subscriber.cancelSubscription();
    }
}
