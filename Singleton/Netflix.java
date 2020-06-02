
public class Netflix {
    private static Netflix netflix;


    private Netflix(){
        
    }
    
    public static Netflix getInstance() 
    { 
        if (netflix == null) 
            netflix = new Netflix(); 
        return netflix; 
    }

    public void reproduce(String user, String movie){
        System.out.println("El usuario " + user + " está reproduciendo: " + movie);
    }

}
