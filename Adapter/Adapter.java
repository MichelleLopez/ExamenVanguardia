
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HuluAccount hulu = new HuluAccount();
        hulu.listContent();
        NetflixAccount netflix = new NetflixAccount();
        netflix.listContent();
        
        AccountAdapter adapter = new AccountAdapter(new NetflixAccount());
        adapter.listContent();
    }
    
}
