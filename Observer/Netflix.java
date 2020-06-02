
import java.util.ArrayList;

public class Netflix implements Subject{
    ArrayList<NetflixObserver> observers = new ArrayList();
    String movie;
    
    public Netflix() {
    }

    @Override
    public void registerObserver(NetflixObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NetflixObserver observer) {
        observers.remove(observer);
    }
    
     @Override
    public void notifyAllObservers() {
        observers.forEach((observer) -> {
            observer.Update(this);
        });
    }

    public void addMovie(String movie) {
        this.movie = movie;
        notifyAllObservers();
    }

    public String getMovie() {
        return this.movie;
    }

    @Override
    public String toString() {
        return ", Netflix ha subido una nueva pelicula: " + this.movie;
    }

    
    


   

}
