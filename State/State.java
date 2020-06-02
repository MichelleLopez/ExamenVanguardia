
public class State {

    public static void main(String[] args) {
        Context context = new Context();
        
        System.out.println("Suscripcion pagada:");
        context.setState(new PaidSubscription());
        context.action();

        System.out.println("Suscripcion no Pagada:");
        context.setState(new UnpaidSubscription());
        context.action();

    }
    
}
