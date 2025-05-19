import java.util.Scanner;
public class User {
    private String nama;
    private int nim;
    protected static Scanner input = new Scanner(System.in);

    public User(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public void login() {
        System.out.print("Login User...");

    }
}