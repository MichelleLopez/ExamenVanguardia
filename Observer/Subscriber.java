
public class Subscriber implements NetflixObserver{
    private String name;
   
    public Subscriber(){
    }
    
    public Subscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void Update(Subject subject){
        System.out.println(this.name + subject);
    }
}
