package herbivora;

public class BadakSumatera extends herbivora.Badak implements herbivora.SifatBadak {
    public BadakSumatera(String nama, int umur) {
        super(nama, umur);
    }
    @Override
    public void suara() {
        System.out.println("Badak Sumatera mengeluarkan suara dengusan halus.");
    }
    @Override
    public void makanRumput() {
        System.out.println("Badak Sumatera memakan dedaunan dan rumput.");
    }
    public void ciriKhas() {
        System.out.println("Badak Sumatera memiliki dua cula dan berbulu halus.");
    }

    public static void main(String[] args) {
        BadakSumatera badak = new BadakSumatera("Sari", 15);
        badak.info();
        badak.suara();
        badak.makanRumput();
        badak.ciriKhas();
    }
}
