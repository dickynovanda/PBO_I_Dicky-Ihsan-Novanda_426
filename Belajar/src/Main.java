//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama;
        char jenisklmn;
        int tahunlhr;
        int umur;

        Scanner objinput = new Scanner(System.in);

        //Meminta Input Nama
        System.out.print("Masukkan Nama: ");
        nama = objinput.nextLine();

        //Meminta Input Jenis Kelamin
        System.out.print("Masukkan Jenis Kelamin(L/P): ");
        jenisklmn = objinput.nextLine().charAt(0);

        //Meminta Input Tanggal Lahir
        System.out.print("Masukkan Tahun Lahir: ");
        tahunlhr = objinput.nextInt();

        //Menutup Scanner

        //Menghitung umur berdasarkan tahun lahir
        int tahun_sekarang = LocalDate.now().getYear();
        umur = tahun_sekarang - tahunlhr;

        //Menentukan Jenis Kelamin

        String jenisklmnStr;
        if (jenisklmn == 'L' || jenisklmn == 'l'){
            jenisklmnStr = "Laki-Laki";
        } else if (jenisklmn == 'P' || jenisklmn == 'p') {
            jenisklmnStr = "Perempuan";
        }else{
            jenisklmnStr = "Jenis Kelamin Tidak Diketahui";
        }
        //Menampilkan Hasil
        System.out.println("\nData Diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisklmnStr);
        System.out.println("Umur: " + umur);
    }
}