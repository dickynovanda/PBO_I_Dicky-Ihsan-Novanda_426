package com.praktikum.users;

import com.praktikum.actions.AdminActions;
import com.praktikum.main.LoginSystem;
import com.praktikum.data.Item;

public class Admin extends User implements AdminActions {
    protected String username;
    protected String password;

    public Admin(String name, String id, String username, String password) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    @Override
    public void manageItems(){
        System.out.println("\n--- Kelola Barang ---");
        System.out.println("1. Lihat Semua Laporan");
        System.out.println("2. Tandai Barang Telah Diambil");
        System.out.print("Pilih: ");
        int choice = input.nextInt(); input.nextLine();

        switch (choice) {
            case 1:
                for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
                    Item item = LoginSystem.reportedItems.get(i);
                    System.out.println(i + ". " + item.getItemName() + " | Status: " + item.getStatus());
                }
                break;
            case 2:
                System.out.println("Barang yang bisa ditandai:");
                for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
                    Item item = LoginSystem.reportedItems.get(i);
                    if (item.getStatus().equals("Reported")) {
                        System.out.println(i + ". " + item.getItemName());
                    }
                }
                try {
                    System.out.print("Pilih indeks barang: ");
                    int idx = input.nextInt();
                    input.nextLine();
                    LoginSystem.reportedItems.get(idx).setStatus("Claimed");
                    System.out.println("Barang berhasil ditandai sebagai 'Claimed'.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Indeks tidak valid.");
                }
                break;
        }
    }
    @Override
    public void manageUsers(){
        System.out.println("\n--- Kelola Pengguna ---");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        System.out.print("Pilih: ");
        int choice = input.nextInt(); input.nextLine();

        if (choice == 1) {
            System.out.print("Nama Mahasiswa: ");
            String name = input.nextLine();
            System.out.print("NIM: ");
            String nim = input.nextLine();
            LoginSystem.userList.add(new Mahasiswa(name, nim));
            System.out.println("Mahasiswa ditambahkan.");
        } else if (choice == 2) {
            System.out.print("NIM yang ingin dihapus: ");
            String nim = input.nextLine();
            boolean removed = false;
            for (int i = 0; i < LoginSystem.userList.size(); i++) {
                User u = LoginSystem.userList.get(i);
                if (u instanceof Mahasiswa && u.id.equals(nim)) {
                    LoginSystem.userList.remove(i);
                    removed = true;
                    System.out.println("Mahasiswa berhasil dihapus.");
                    break;
                }
            }
            if (!removed) System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
    @Override
    public void displayAppMenu() {
        System.out.println("\n--- Menu Admin ---");
        System.out.println("1. Kelola Barang");
        System.out.println("2. Kelola Pengguna");
        System.out.print("Pilih Menu: ");
    }
}
