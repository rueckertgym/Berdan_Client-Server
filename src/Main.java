import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShopServer a = new ShopServer(13);
        UserClient Nutzer = new UserClient("192.168.178.30", 13);
        a.processNewConnection("192.168.178.30", 13);

        EingabenRegistrieren NutzerEingabe = new EingabenRegistrieren();
        //Nutzer.send(NutzerEingabe.getEingabe());
        Nutzer.send(NutzerEingabe.getEingabe());
        //if (!NutzerEingabe.getEingabe().equals("ABMELDEN")) {
            //EingabenRegistrieren NutzerEingabe1 = new EingabenRegistrieren();
            //Nutzer.send(NutzerEingabe1.getEingabe());
        }
    }
//}