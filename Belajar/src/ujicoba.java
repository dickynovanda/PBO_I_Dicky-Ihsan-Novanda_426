import java.util.Scanner;

public class ujicoba {
    public static void main(String[] ags){
        String username;
        String password;
        String namamhs;
        int nim;

        Scanner Input = new Scanner(System.in);

        System.out.println("Pilih Login: ");
        System.out.println("1. Admin  ");
        System.out.println("2. Mahasiswa ");

        int pilihan;
        System.out.print("Masukkan Pilihan(1/2): ");
        pilihan = Input.nextInt();
        Input.nextLine(); // konsumsi newline

        if (pilihan == 1){
            System.out.print("Masukkan Username: ");
            username = Input.nextLine();
            System.out.print("Masukkan Password: ");
            password = Input.nextLine();

            if (username.equals("Admin010") && password.equals("Password010")){
                System.out.println("Login Admin Berhasil!");
            }else{
                System.out.println("Login Gagal! User Name atau Password Salah!");
            }
        }else if (pilihan == 2){
            System.out.print("Masukkan Nama: ");
            namamhs = Input.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = Input.nextInt();
            Input.nextLine(); // konsumsi newline

            if (namamhs.equals("Ken Bimantoro") && ("" + nim).equals("20231070311006")){
                System.out.println("Login Mahasiswa Berhasil");
                System.out.println("Nama: " + namamhs);
                System.out.println("NIM: " + nim);
            }else {
                System.out.println("Login Gagal! Nama atau NIM Salah.");
            }

        }else {
            System.out.println("Pilihan Tidak Valid!");
        }

        Input.close();
    }
}
