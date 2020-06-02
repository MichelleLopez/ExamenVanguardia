
public class Movie {
    MovieType genre;
    public Movie(){}

    public Movie(MovieType genre) {
        this.genre = genre;
    }

    public MovieType getGenre() {
        return genre;
    }

    public void setPanes(MovieType genre) {
        this.genre = genre;
    }
    
}
