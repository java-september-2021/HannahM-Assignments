public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "T-Mobile", "RING RING");
        Iphone x = new Iphone("X", 100, "ATT", "Zzz zzz zzz");
        s9.displayInfo();
        x.displayInfo();
    }
}