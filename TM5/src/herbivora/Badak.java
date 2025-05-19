package herbivora;

public abstract class Badak {
    protected String nama;
    protected int umur;

    public Badak(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    public abstract void suara();
}
