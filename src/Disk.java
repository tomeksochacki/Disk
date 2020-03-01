public class Disk {
    private static double vat;

    private String model;
    private double price;
    private int capacity;

    public Disk(String m, double p, int c) {
        model = m;
        price = p;
        capacity = c;
    }
    public String getDescription(){
        return model + ", " + capacity + " GB";
    }

    public double getBruttoPrice(){
        return price * (1 + vat/100);
    }

    public static void setVat(double v){
        vat = v;
    }
}
