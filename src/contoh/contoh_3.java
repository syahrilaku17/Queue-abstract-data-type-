package contoh;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class contoh_3 {
    public static void main(String[] args) {
        Queue queue_41170676_Syahril_Irfani_Fattah = new LinkedList();
        queue_41170676_Syahril_Irfani_Fattah.add(3);
        queue_41170676_Syahril_Irfani_Fattah.add(5);
        queue_41170676_Syahril_Irfani_Fattah.add(7);
        queue_41170676_Syahril_Irfani_Fattah.add(9);
        System.out.println("Data antrean\t: " +queue_41170676_Syahril_Irfani_Fattah);
        System.out.println("Antrean Terdepan: " +queue_41170676_Syahril_Irfani_Fattah.element());

        System.out.println("Hapus Antrean\t: " +queue_41170676_Syahril_Irfani_Fattah.remove());
        System.out.println("Daftar Antrean Sekarang Adalah\t: "+queue_41170676_Syahril_Irfani_Fattah);
        System.out.println("Hapus Antrean berikutnya\t: "+queue_41170676_Syahril_Irfani_Fattah.remove());
        System.out.println("Daftar Antrean Sekarang Adalah\t: "+queue_41170676_Syahril_Irfani_Fattah);
        System.out.println("Hapus Semua Antrean\t: "+queue_41170676_Syahril_Irfani_Fattah.removeAll(queue_41170676_Syahril_Irfani_Fattah));
        System.out.println("Daftar Antrean Setelah Dihapus Semua\t: "+queue_41170676_Syahril_Irfani_Fattah);
    }
}
