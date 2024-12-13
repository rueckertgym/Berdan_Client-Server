import utils.Client;

import java.util.Scanner;

public class UserClient extends Client {
    public UserClient(String pServerIP, int pServerPort){
        super(pServerIP, pServerPort);
    }
    public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
        this.send("Einhornfurzkissen:" + pGroesse+ ":" + pFarbe);
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
