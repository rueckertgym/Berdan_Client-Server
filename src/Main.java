import java.util.Scanner;

public class Main {

    static EingabenRegistrieren NutzerEingabe = new EingabenRegistrieren();

    public static void main(String[] args) {
        ShopServer a = new ShopServer(13);
        UserClient Nutzer = new UserClient("10.56.17.190", 13);
        a.processNewConnection("10.56.17.190", 13);

        Nutzer.send(NutzerEingabe.Verarbeiten());
        if (NutzerEingabe.getEingabe().equals(splitt())){
            Scanner in = new Scanner(System.in);
            String Bestaetigung = in.nextLine();
            Bestaetigung = "Bestaetigung" + ":" + Bestaetigung;
            Nutzer.send(Bestaetigung);
        }
    }
    public static String splitt(){
        String[] b = NutzerEingabe.getEingabe().split(":");
        return b[0];
    }
    /*
    public void Aktion(){
        Nutzer.send(NutzerEingabe.Verarbeiten());
        if (NutzerEingabe.getEingabe().equals(splitt())){
            Scanner in = new Scanner(System.in);
            String Bestaetigung = in.nextLine();
            Bestaetigung = "Bestaetigung" + ":" + Bestaetigung;
            Nutzer.send(Bestaetigung);
        }
    }
     */
}