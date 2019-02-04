package contoh;

import java.util.LinkedList;
import java.util.Queue;

public class contoh_2 {
    public static void main(String[] args) {
        Queue<String> Tungguantre_41170676_Syahril_Irfani_Fattah = new LinkedList<>();
        Tungguantre_41170676_Syahril_Irfani_Fattah.add("V Waluyo");
        Tungguantre_41170676_Syahril_Irfani_Fattah.add("J Driyono");
        Tungguantre_41170676_Syahril_Irfani_Fattah.add("R Tisha");
        Tungguantre_41170676_Syahril_Irfani_Fattah.add("Gusti R");

        System.out.println(" Antrean : " + Tungguantre_41170676_Syahril_Irfani_Fattah);
        // Periksa apakah Antrian kosong
        System.out.println("apakah antrean kosong? : " + Tungguantre_41170676_Syahril_Irfani_Fattah.isEmpty());
        // Temukan ukuran Antrian
        System.out.println("Panjang antrean : " + Tungguantre_41170676_Syahril_Irfani_Fattah.size());
        // Periksa apakah Antrian mengandung elemen
        String name = "E Rahmayadi";
        if(Tungguantre_41170676_Syahril_Irfani_Fattah.contains(name)) {
            System.out.println("Waiting Queue contain :" + name);
        } else {
            System.out.println("Menunggu antre: " + name);
        }
        // Dapatkan elemen di bagian depan Antrian tanpa menghapusnya menggunakan elemen ()
        // Metode elemen () melempar NoSuchElementException jika Antrian kosong
        String AntreanPertama =  Tungguantre_41170676_Syahril_Irfani_Fattah.element();
        System.out.println("Antrean Pertama (element()) : " + AntreanPertama);

        // Dapatkan elemen di bagian depan Antrian tanpa menghapusnya menggunakan peek ()
        // Metode peek () mirip dengan elemen () kecuali bahwa ia mengembalikan null jika Antrian kosong
        AntreanPertama= Tungguantre_41170676_Syahril_Irfani_Fattah.peek();
        System.out.println("Antrean Pertama : " + AntreanPertama);
    }
}
//NOTE = VARIABELNYA : tungguantre , name , AntreanPertama