public class Main {
    public static void main(String[] args) {
        Disk.setVat(22.0);
        Disk d1 = new Disk("Barracuda", 250, 60);

        System.out.println(d1.getDescription()+" - cena "+ d1.getBruttoPrice() + " zł" );
    }
}
