
public class RomanceMovieBuilder implements MovieBuilder{
    private final Movie romanceMovie = new Movie();


    @Override
    public void addTittle(String tittle) {
        romanceMovie.tittle =  tittle;
    }

    @Override
    public void addDirector(String director) {
        romanceMovie.director =  director;
        
    }

    @Override
    public void addMainActress(String actress) {
        romanceMovie.mainActress =  actress;
    }

    @Override
    public void addMainActor(String actor) {
        romanceMovie.mainActor =  actor;
    }

    @Override
    public void addMinutes(int minutes) {
        romanceMovie.minutes =  minutes;
    }

    @Override
    public void addYear(int year) {
        romanceMovie.year =  year;
    }

    @Override
    public Movie getMovie() {
        return this.romanceMovie;
    }
}
