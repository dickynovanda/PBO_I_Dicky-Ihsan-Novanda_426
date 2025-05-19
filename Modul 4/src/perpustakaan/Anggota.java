package perpustakaan;

public class Anggota implements Peminjaman{
    private String nama;
    private String nim;

    public Anggota(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanInfoang(){
        System.out.println("Anggota: "+ nama + nim);
    }
    //Overiding interface methods
    @Override
    public void pinjamBuku(){
        System.out.println();
        System.out.println(nama + nim +" meminkam buku.");
    }

    @Override
    public void kembalikanBuku(){
        System.out.println(nama + nim +" mengembalikan buku.");
    }

    //overloading
    public void pinjamBuku(String judul){
        System.out.println(nama + "meminjam buku berjudul: " + judul);
    }

    public void pinjamBuku(String judul, int durasi){
        System.out.println(nama + "meminjam buku berjudul: " + judul + " selama " + durasi + " hari");
    }
}
