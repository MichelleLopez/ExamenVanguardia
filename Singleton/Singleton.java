
public class Singleton {

    public static void main(String[] args) {
        User user1 = new User("Juan");
        User user2 = new User("María");
        User user3 = new User("Carlos");

        user1.selectMovie("Matrix");
        user2.selectMovie("The lord of the rings");
        user3.selectMovie("Harry Potter");
    }
    
}
