
public class Factory {

    public static void main(String[] args) {
        MovieFactory factory = new MovieFactory();
        Movie actionMovie = factory.makeMovie(MovieType.ACTION);
        System.out.println(actionMovie.getGenre());
        Movie comedyMovie = factory.makeMovie(MovieType.COMEDY);
        System.out.println(comedyMovie.getGenre());
        Movie romanceMovie = factory.makeMovie(MovieType.ROMANCE);
        System.out.println(romanceMovie.getGenre());
    }
    
}
