package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import com.praktikum.data.Item;
import com.praktikum.main.LoginSystem;

public class Mahasiswa extends User implements MahasiswaActions {
    private String namaBarang;
    private String deskripsi;
    private String lokasi;

    public Mahasiswa(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public void reportItem(){
        System.out.println("======= Formulir Laporan Barang Hilang =======");

        System.out.print("Masukkan Nama Barang: ");
        namaBarang = input.nextLine();

        System.out.print("Masukkan Deskripsi Barang: ");
        deskripsi = input.nextLine();

        System.out.print("Masukkan Lokasi Terakhir/Ditemukan: ");
        lokasi = input.nextLine();

        Item item = new Item(namaBarang, deskripsi, lokasi, "Reported");
        LoginSystem.reportedItems.add(item);
        System.out.println("\nLaporan berhasil dikirim!");

    }
    @Override
    public void viewReportedItems() {
        boolean found = false;
        for (Item i : LoginSystem.reportedItems) {
            if (i.getStatus().equals("Reported")) {
                found = true;
                System.out.println("- " + i.getItemName() + " | " + i.getDescription() + " | " + i.getLocation());
            }
        }
        if (!found) {
            System.out.println(">> Belum ada laporan barang. <<");
        }
    }

    @Override
    public void displayAppMenu() {
        int menu;
        do {
            System.out.println("\n--- Menu Mahasiswa ---");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 0);
    }
}

