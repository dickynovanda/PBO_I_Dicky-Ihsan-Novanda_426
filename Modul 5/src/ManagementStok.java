import java.util.ArrayList;
import java.util.Scanner;

public class ManagementStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1": // Tambah barang
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();

                    System.out.print("Masukkan stok awal: ");
                    int stokAwal = Integer.parseInt(scanner.nextLine());

                    daftarBarang.add(new Barang(nama, stokAwal));
                    System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
                    break;

                case "2": // Tampilkan barang
                    System.out.println("\n--- Daftar Barang ---");

                    if (daftarBarang.size() > 0) {
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            System.out.println(i + ". " + daftarBarang.get(i));
                        }
                    } else {
                        System.out.println("Belum ada barang yang diinputkan.");
                    }
                    System.out.println("----------------------");


                case "3": // Kurangi stok
                    System.out.println("\n--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
                    for (int i = 0; i < daftarBarang.size(); i++) {
                        System.out.println(i + ". " + daftarBarang.get(i));
                    }

                    try {
                        System.out.print("Masukkan nomor indeks barang: ");
                        int index = Integer.parseInt(scanner.nextLine());

                        Barang barang = daftarBarang.get(index);

                        System.out.print("Masukkan jumlah stok yang akan diambil: ");
                        int jumlahAmbil = Integer.parseInt(scanner.nextLine());

                        if (jumlahAmbil > barang.getStok()) {
                            throw new StokTidakCukupException("Stok untuk '" + barang.getNama() +
                                    "' hanya tersisa " + barang.getStok());
                        }

                        // Kurangi stok
                        barang.setStok(barang.getStok() - jumlahAmbil);
                        System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. " +
                                "Sisa stok: " + barang.getStok());

                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks barang tidak valid.");
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus berupa angka.");
                    } catch (StokTidakCukupException e) {
                        System.out.println("Kesalahan stok: " + e.getMessage());
                    }
                    break;

                case "0": // Keluar
                    System.out.println("Terima kasih! Program berakhir.");
                    running = false;
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih ulang.");
                    break;
            }
        }

        scanner.close();
    }
}
