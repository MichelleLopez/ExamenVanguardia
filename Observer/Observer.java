
public class Observer {

    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        Subscriber user = new Subscriber("Pedro");
        netflix.registerObserver(user);
        Subscriber user2 = new Subscriber("Maria");
        netflix.registerObserver(user2);
        netflix.addMovie("Star Wars XXV");
    }
    
}
