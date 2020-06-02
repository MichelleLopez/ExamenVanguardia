
public interface Subject {
    public void registerObserver(NetflixObserver observer);
    public void removeObserver(NetflixObserver observer);
    public void notifyAllObservers();
}
