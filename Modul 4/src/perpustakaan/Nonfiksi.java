package perpustakaan;

public class Nonfiksi extends Buku{
    public Nonfiksi(String judul, String penulis){
        super(judul, penulis);
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Non-Fiksi: " + judul + " - " + penulis);
        System.out.println();
    }
}
