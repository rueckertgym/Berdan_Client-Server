import utils.Client;
public class UserClient extends Client {
    public UserClient(String pServerIP, int pServerPort){
        super(pServerIP, pServerPort);
        groesseFarbeWaehlen("M", "ROt");
    }
    public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
        this.send("TShirt:" + pGroesse+ ":" + pFarbe);
    }
    public void bestaetigen(String pAntwort){
        this.send("Bestaetigung:" + pAntwort);
    }
    public void abmelden(){
        this.send("Abmelden");
    }
    public void processMessage(String pMessage) {
    }
    public static void main(String[] args) {
        new ShopServer(13);
        new UserClient("11.12", 13);
    }
}
