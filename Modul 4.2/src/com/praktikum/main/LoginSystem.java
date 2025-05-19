package com.praktikum.main;

import com.praktikum.actions.AdminActions;
import com.praktikum.actions.MahasiswaActions;
import com.praktikum.users.*;
import com.praktikum.data.Item;
import java.util.ArrayList;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void main(String[] args) {
        userList.add(new Admin("Admin", "001", "admin456", "password456"));
        userList.add(new Mahasiswa("Raka", "456"));

        System.out.println("Pilihan Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan (1/2): ");

        int pilihan = User.input.nextInt();
        User.input.nextLine();

        if (pilihan == 1) {
            loginAdmin();  // Panggil method login khusus Admin
        } else if (pilihan == 2) {
            loginMahasiswa(); // Panggil method login khusus Mahasiswa
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        User.input.close();
    }

    public static void loginAdmin() {
        System.out.print("Masukkan Username: ");
        String username = User.input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = User.input.nextLine();
       

        for (User u : userList) {
            if (u instanceof Admin) {
                Admin a = (Admin) u;
                if (a.getUsername().equals(username) && a.getPassword().equals(password)) {
                    System.out.println("Login Admin Berhasil!");
                    AdminActions adminActions = a; // Gunakan interface
                    adminActions.displayAppMenu();
                    int menu = User.input.nextInt();
                    User.input.nextLine();

                    if (menu == 1) {
                        adminActions.manageItems();
                    } else if (menu == 2) {
                        adminActions.manageUsers();
                    } else {
                        System.out.println("Menu tidak valid.");
                    }
                    return;
                }
            }
        }

        System.out.println("Username atau Password salah. Login gagal.");
    }

    public static void loginMahasiswa() {
        System.out.print("Masukkan Nama: ");
        String nama = User.input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = User.input.nextLine();

        for (User u : userList) {
            if (u instanceof Mahasiswa) {
                Mahasiswa m = (Mahasiswa) u;
                if (m.getName().equals(nama) && m.getId().equals(nim)) {
                    System.out.println("Login Mahasiswa Berhasil!");
                    MahasiswaActions mahasiswaActions = m; // Gunakan interface
                    mahasiswaActions.displayAppMenu();
                    return;
                }
            }
        }

        System.out.println("Nama atau NIM salah. Login gagal.");
    }
}
