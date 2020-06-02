
public class Builder {

    public static void main(String[] args) {
        MovieBuilder movieBuilder = new RomanceMovieBuilder();
        MovieDirector movieDirector = new MovieDirector();
        movieDirector.createMovie(movieBuilder);
        Movie movie = movieBuilder.getMovie();
        System.out.println(movie.toString());
    }
    
}
