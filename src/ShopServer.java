import utils.Client;
import utils.Server;
import java.util.Scanner;

public class ShopServer extends Server {
    public ShopServer(int pPort) {
        super(pPort);
    }

    public void processNewConnection(String pClientIP, int pClientPort) {
        this.send(pClientIP, pClientPort, "Willkommen! Wählen sie eine Größe und eine Darbe für ihr Einhornfurzkissen");
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        String[] nachrichtenTeil = pMessage.split(":");
        if (nachrichtenTeil[0].equals("Einhornfurzkissen")) {
            this.send(pClientIP, pClientPort, "Die Größe ist " + nachrichtenTeil[1] + ", die Farbe ist " + nachrichtenTeil[2] + " und es kostet 19,99 Euro! Möchten sie die Bestellung wirklich durchführen?");
            System.out.println("Die Größe ist " + nachrichtenTeil[1] + ", die Farbe ist " + nachrichtenTeil[2] + " und es kostet 19,99 Euro! Möchten sie die Bestellung wirklich durchführen?");
            System.out.println("Schreiben sie `ja´ oder `nein´.");
        } else if(nachrichtenTeil[0].equals("Bestaetigung")){
            if(nachrichtenTeil[1].equals("ja")){
                this.send(pClientIP, pClientPort, "Vielen Dank für ihre Bestellung.");
                System.out.println("Vielen Dank für ihre Bestellung.");
                closeConnection(pClientIP, pClientPort);
            } else if(nachrichtenTeil[1].equals("nein")){
                System.out.println("Okay, einen drecks Tag noch.");
                closeConnection(pClientIP, pClientPort);
            } else {
                this.send(pClientIP,pClientPort, "Bitte geben sie ja oder nein ein.");
                System.out.println("Bitte geben sie ja oder nein ein.");
            }
        } else if(nachrichtenTeil[0].equals("ABMELDEN")) {
            System.out.println("Sie werden abgemeldet.");
            closeConnection(pClientIP, pClientPort);
        }  else {
            this.send(pClientIP, pClientPort, "Bitte korrigieren sie ihre Eingaben.");
            System.out.println("Bitte korrigieren sie ihre Eingaben");

        }
    }

    public void processClosingConnection(String pClientIP, int pClientPort) {
    }
}
