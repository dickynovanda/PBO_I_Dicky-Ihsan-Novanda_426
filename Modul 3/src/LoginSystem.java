public class LoginSystem {
    public static void main(String [] args){
        Admin admin = new Admin("Budi", 9999, "admin123", "password123");
        Mahasiswa mahasiswa = new Mahasiswa("Dicky Ihsan", 426);
        System.out.println("Pilihan Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan (1/2): ");

        int pilihan = User.input.nextInt();
        User.input.nextLine();

        if (pilihan == 1){
            admin.login();
        } else if (pilihan == 2) {
            mahasiswa.login();
        }else {
            System.out.println("Pilihan Tidak Valid");
        }
        User.input.close();
    }
}
