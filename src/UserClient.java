import utils.Client;
public class UserClient extends Client {
    public UserClient(String pServerIP, int pServerPort){
        super(pServerIP, pServerPort);
    }
    public void groesseFahreWaehlen(String pGroesse, String pFarbe){
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
}
