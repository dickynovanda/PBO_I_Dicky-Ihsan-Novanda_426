public class Harimau {
    String nama = "Harimau";
    String warna = "Kuning Belang Hitam";
    String panjang = "250 cm", tinggi = "60 cm", berat = "140 Kg";
    String makanan = "Karnivora";
    //Method
    void Tampilkaninfo() {
        System.out.println("Nama Hewan: "+nama);
        System.out.println("Warna: "+ warna);
        System.out.println("Panjang: "+ panjang);
        System.out.println("Tinggi: "+ tinggi);
        System.out.println("Berat: "+ berat);
        System.out.println("Berdasarkan Makanannya: "+makanan);

    }
    void buas(){
        System.out.println("Harimau adalah hewan buas pemakan daging atau karnivora");
        System.out.println("Harimau memiliki kemampuan melompat,memanjat dan perenang yang baik");
    }
    void ancaman(){
        System.out.println("Harimau terancam punah akibat perburuan, perdagangan ilegal bagian tubuh harimau, dan perusakan habitat.");
    }
    public static void main(String[] args){
        Harimau harimau = new Harimau();
        harimau.Tampilkaninfo();
        harimau.buas();
        harimau.ancaman();
    }
}
