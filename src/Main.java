import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShopServer a = new ShopServer(13);
        UserClient Nutzer = new UserClient("10.56.17.190", 13);
        a.processNewConnection("10.56.17.190", 13);
        Bestellung b = new Bestellung();
        Nutzer.send("Einhornfurzkissen:M:Rot");
        a.processMessage("11.12", 13,);
    }
}