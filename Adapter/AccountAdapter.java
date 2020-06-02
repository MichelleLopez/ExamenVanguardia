
public class AccountAdapter extends HuluAccount{
    private NetflixAccount netflix;

    public AccountAdapter(NetflixAccount account) {
        this.netflix = account;
    }
    
    public void listContent() {
        System.out.println("Imprimiendo listado de peliculas adaptadas");
        System.out.println("Imprimiendo listado de series adaptadas");
        System.out.println("Imprimiendo listado de documentales adaptadas");
        System.out.println("Imprimiendo listado de Anime adaptadas");
    }
    
}
