class Mahasiswa extends User{
    public Mahasiswa(String nama, int nim){
        super(nama, nim);

    }
    @Override
    public void login(){
        System.out.print("Masukkan Nama: ");
        String inputNama = input.nextLine();
        System.out.print("Masukkan Nim: ");
        while (!input.hasNextInt()){
            System.out.println("NIM Harus berupa angka! Coba Lagi.");
            input.next();
        }
        int inputNim = input.nextInt();
        input.nextLine();

        if (inputNama.equals(this.getNama()) && inputNim == this.getNim()){
            System.out.println("Login Mahasiswa Berhasil! Selamat Datang, "+ inputNama + ".\n");
            System.out.println("Nama : "+ inputNama);
            System.out.println("Nim : "+ inputNim);

        }else{
            System.out.println("Login Mahasiswa Gagal!");

        }
    }
}