import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nama;
        String nim;
        String password;
        String username;
        int pilihan;

        Scanner Input = new Scanner(System.in);
        System.out.println("Pilih Login");
        System.out.println("1. Admin ");
        System.out.println("1. Mahasiswa ");
        System.out.print("Masukkan Pilihan(1/2): ");
        pilihan = Input.nextInt();
        Input.nextLine();

        if (pilihan == 1){
            System.out.print("Masukkan Username: ");
            username = Input.nextLine();
            System.out.print("Masukkan Password: ");
            password = Input. nextLine();
            if (username.equals("Admin100") && password.equals("mashaallah")){
                System.out.println("Login Berhasil");
            }else {
                System.out.println("Login Gagal");
            }

        }else if (pilihan == 2) {
            System.out.print("Masukkan Username: ");
            username = Input.nextLine();
            System.out.print("Masukkan Password: ");
            password = Input.nextLine();

            if (username.equals("dicky") && password.equals("dicky426")){
                System.out.println("Login Berhasil");
            }else {
                System.out.println("Login Gagal");
            }
        }else {
            System.out.println("Pilihan Tidak Valid");
        }


    }
}
