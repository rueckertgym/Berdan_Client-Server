import java.util.Scanner;

public class Main {

    static EingabenRegistrieren NutzerEingabe = new EingabenRegistrieren();

    public static void main(String[] args) {
        ShopServer a = new ShopServer(13);
        System.out.println("Geben sie ihre IP-Adresse an:");
        Scanner in = new Scanner(System.in);
        String IP = (String) in.nextLine();
        UserClient Nutzer = new UserClient(IP, 13);
        a.processNewConnection(IP, 13);
        System.out.println(a.isConnectedTo(IP,13));

        Nutzer.send(NutzerEingabe.Verarbeiten());
        if (NutzerEingabe.getEingabe().equals(splitt())){
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