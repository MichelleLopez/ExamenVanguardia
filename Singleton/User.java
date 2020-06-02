
public class User {
    private String name;
    private String movie;

    public User(String name) {
        this.name = name;
    }

    public void selectMovie(String movie){
        this.movie = movie;
        Netflix netflix = Netflix.getInstance();
        netflix.reproduce(this.name, this.movie);
    }
}
