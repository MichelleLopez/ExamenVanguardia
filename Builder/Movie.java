
public class Movie {
    String tittle;
    String director;
    String mainActress;
    String mainActor;
    int minutes;
    int year;
    
    public Movie(){
    
    }

    @Override
    public String toString() {
        return "Pelicula:" + this.tittle + 
                "\nDirector: " + this.director + 
                "\nActriz Principal: " + this.mainActress + 
                "\nActor Principal: " + this.mainActor + 
                "\nDuracion: " + this.minutes + 
                "\nAño: " + this.year;
    }
}
