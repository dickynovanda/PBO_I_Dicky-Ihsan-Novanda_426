package Fauna;

public class Main extends Tapir {
    public Main(String warna, String panjang, String tinggi, String berat, String jnsmakanan){
        super(warna, tinggi, panjang, berat, jnsmakanan);
    }
    @Override
    public void makan(String warna, String jnsmakanan){
        System.out.println("Tapir berwarna " + warna + " itu sedang makan " +  jnsmakanan);
    }
    public void berlari(String berat, String panjang){
        System.out.println("Tapir berbobot " + berat + " dan panjang " + panjang +" sedang berlari");
    }
    public void tidur (String tinggi){
        System.out.println("Tapir dengan tinggi " + tinggi + " sedang tidur");
    }

    public static void main(String[] args){
        Main tapir = new Main("Putih Hitam", "2 meter", "1.2 meter", "250 kg", "daun-daunan");

        tapir.makan(tapir.warna, tapir.jnsmakanan);
        tapir.berlari(tapir.berat, tapir.panjang);
        tapir.tidur(tapir.tinggi);
    }
}
