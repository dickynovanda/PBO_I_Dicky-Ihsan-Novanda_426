import java.time.LocalDate;
import java.util.Scanner;

public class Belajar {
    public static void main(String[] args){
        String nama;
        char jnsklmn;
        int Nim;
        String tanggallhr;
        LocalDate tgllahir;
        int umur;
        int thnlahir;


        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        nama = Input.nextLine();
        System.out.print("Masukkan Jenis Kelamin: ");
        jnsklmn = Input.nextLine().charAt(0);
        System.out.print("Masukkan Nim: ");
        Nim = Input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        thnlahir = Input.nextInt();


        int Thnsekarang = LocalDate.now().getYear();
        umur = Thnsekarang - thnlahir;

        String jnsklmnStr;
        if (jnsklmn == 'L' || jnsklmn == 'l'){
            jnsklmnStr = "Laki-Laki";
        } else if (jnsklmn == 'P' || jnsklmn == 'p') {
            jnsklmnStr = "Perempuan";
        }else{
            jnsklmnStr = "Jenis Kelamin Tidak Diketahui";
        }

        char kategori;
        String kategoriStr;
        if (umur >= 0 && umur < 6 ){
            kategoriStr = "Balita";
        } else if (umur >= 6 && umur < 12 ) {
            kategoriStr = "Anak-anak";
        }else if (umur >= 12 && umur < 20 ) {
            kategoriStr = "Remaja";
        }else if (umur >= 20 && umur < 50 ) {
            kategoriStr = "Dewasa";
        }else if (umur >= 50 && umur < 120 ) {
            kategoriStr = "Lansia";
        }else {
            kategoriStr = "Kategori Invalid";
        }

        System.out.println("\nNama: " + nama);
        System.out.println("Jenis Kelamin: "+jnsklmnStr);
        System.out.println("NIM: " + Nim);
        System.out.println("Umur: " + umur);
        System.out.println("Kategori: " + kategoriStr);


    }
}
