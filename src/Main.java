public class Main {
    public static void main(String[] args) {
        new ShopServer(13);
        new UserClient("11.12", 13);
        UserClient.groesseFarbeWaehlen();
    }
}