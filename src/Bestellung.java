import java.util.Scanner;

public class Bestellung {
    private String Produkt;
    private String Groesse;
    private String Farbe;
    private String Nachricht;


    public Bestellung(){
        Scanner in = new Scanner(System.in);
        System.out.println("Wählen sie bitte ein Produkt:");
        Produkt = in.nextLine();
        System.out.println("Wählen sie eine Größe:");
        Groesse = in.nextLine();
        System.out.println("Wählen sie eine Farbe:");
        Farbe = in.nextLine();
        Nachricht = Produkt + ":" + Groesse + ":" + Farbe;
    }

    public String getNachricht() {
        return Nachricht;
    }
}
