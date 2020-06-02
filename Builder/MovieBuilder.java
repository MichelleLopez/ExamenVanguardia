
public interface MovieBuilder {
    public abstract void addTittle(String tittle);
    public abstract void addDirector(String director);
    public abstract void addMainActress(String actress);
    public abstract void addMainActor(String actor);
    public abstract void addMinutes(int minutes);
    public abstract void addYear(int year);
    
    public abstract Movie getMovie();
}
