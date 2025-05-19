class Admin extends User{
    private String username;
    private String password;
    public Admin(String nama, int nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public void login() {
        System.out.print("Masukkan Username: ");
        String inputUsername = input.nextLine();

        System.out.print("Maasukkan Password: ");
        String inputPassword = input.nextLine();

        if (inputUsername.equals(this.username) && inputPassword.equals(this.password)) {
            System.out.print("Masukkan Nama: ");
            String inputNama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            while (!input.hasNext()){
                System.out.println("NIM harus berupa angka! Coba Lagi. ");
                input.next();
            }
            int inputNim = input.nextInt();
            input.nextLine();

            if (inputNama.equals(getNama()) && inputNim == getNim()){
                System.out.println("Login Admin Berhasil! Selamat Datang " + getNama() + ".");
            }else {
                System.out.println("Login Gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Login Gagal! Username atau password salah");

        }
    }
}