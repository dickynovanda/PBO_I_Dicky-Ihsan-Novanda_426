package app;
import perpustakaan.Buku;
import perpustakaan.Anggota;
import perpustakaan.Nonfiksi;
import perpustakaan.Fiksi;


public class Main {
    public static void main(String[] args){
        Buku buku1 = new Fiksi("Si Kancil Mencuri Timun","Bimbim");
        Buku buku2 = new Nonfiksi("Nation Geographic: Sejarah Rahasia Perang Dunia II", "Neil Kagan dan Stephen G.Hyslop");

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        Anggota anggota1 = new Anggota("Dicky ", "(426)");
        Anggota anggota2 = new Anggota("Bebeb ", "(424)");

        anggota1.tampilkanInfoang();
        anggota2.tampilkanInfoang();

        anggota1.pinjamBuku();
        anggota1.pinjamBuku("Si Kancil Mencuri Timun");
        anggota1.kembalikanBuku();

        anggota2.pinjamBuku();
        anggota2.pinjamBuku("Nation Geographic: Sejarah Rahasia Perang Dunia II", 7);
        anggota2.kembalikanBuku();
    }
}
