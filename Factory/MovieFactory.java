
public class MovieFactory {
    public Movie makeMovie(MovieType genre){
        if(genre.equals(MovieType.ACTION)){
            return new Action();
         
        }else if (genre.equals(MovieType.COMEDY)){
            return new Comedy();
        }else if (genre.equals(MovieType.ROMANCE)){
            return new Romance();
        }
        return new Movie(genre);
    }
}
