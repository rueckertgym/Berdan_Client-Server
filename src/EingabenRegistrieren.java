import java.util.Scanner;

public class EingabenRegistrieren {

    private String Produkt;
    private String Groesse;
    private String Farbe;
    private String Eingabe;
    private boolean Bestellvorgang;

    public EingabenRegistrieren() {
        Scanner in = new Scanner(System.in);
        System.out.println("(1) Bestellen");
        //System.out.println("(2) Bestätigen");
        System.out.println("(2) Abmelden");
        int Option = in.nextInt();
        switch (Option) {
            case 1:
                Scanner a = new Scanner(System.in);
                System.out.println("Wählen sie bitte ein Produkt:");
                Produkt = a.nextLine();
                System.out.println("Wählen sie eine Größe:");
                Groesse = a.nextLine();
                System.out.println("Wählen sie eine Farbe:");
                Farbe = a.nextLine();
                Eingabe = Produkt + ":" + Groesse + ":" + Farbe;
                break;
            case 2:
                Eingabe = "ABMELDEN";
                break;
        }
    }

    public String getEingabe() {
        return Eingabe;
    }
    public void setBestellvorgang(boolean pBestellvorgang){
        Bestellvorgang = pBestellvorgang;
    }
}
