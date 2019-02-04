package latihan;

import java.util.LinkedList;
import java.util.Queue;
public class latihan {
    public static void main(String args[]) { Queue<String> bulan_41170676_Syahril_Irfani_Fattah = new LinkedList<String>();
        System.out.println("Antrean sebelum ditambahkan : " + bulan_41170676_Syahril_Irfani_Fattah);
        bulan_41170676_Syahril_Irfani_Fattah.add("JAN");
        bulan_41170676_Syahril_Irfani_Fattah.add("FEB");
        bulan_41170676_Syahril_Irfani_Fattah.add("MAR");
        bulan_41170676_Syahril_Irfani_Fattah.add("APR");
        bulan_41170676_Syahril_Irfani_Fattah.add("MEI");
        bulan_41170676_Syahril_Irfani_Fattah.add("JUN");
        bulan_41170676_Syahril_Irfani_Fattah.add("JUL");
        bulan_41170676_Syahril_Irfani_Fattah.add("AGU");
        bulan_41170676_Syahril_Irfani_Fattah.add("SEP");
        bulan_41170676_Syahril_Irfani_Fattah.add("OKT");
        bulan_41170676_Syahril_Irfani_Fattah.add("NOV");
        bulan_41170676_Syahril_Irfani_Fattah.add("DES");
        System.out.println("Antrean Setelah Ditambahkan : " + bulan_41170676_Syahril_Irfani_Fattah);
// Memeriksa apakah suatu Objek berada dalam Antrian atau tidak
        boolean hasMei = bulan_41170676_Syahril_Irfani_Fattah.contains("MEI");
        System.out.println("Apakah MEI Ada Diantrean? " + hasMei);
// Mengambil nilai dari kepala Antrian
        String head = bulan_41170676_Syahril_Irfani_Fattah.peek();
        System.out.println("Antrean Pertama : " + head);
// Menghapus objek dari kepala Antrian
        String oldHead = bulan_41170676_Syahril_Irfani_Fattah.poll();
        String nowHead = bulan_41170676_Syahril_Irfani_Fattah.peek();
        System.out.println("old head : " + oldHead);
        System.out.println("now head of Queue is: " + bulan_41170676_Syahril_Irfani_Fattah);
        System.out.println("now head : " + nowHead);
// Cara lain untuk menghapus objek kepala dari Antrian
        bulan_41170676_Syahril_Irfani_Fattah.remove();
        System.out.println("new head of Queue is: " + bulan_41170676_Syahril_Irfani_Fattah);
        System.out.println("new head of Queue is: " + bulan_41170676_Syahril_Irfani_Fattah.peek());
    }
}



//NOTE = vARIBELNYA bulan
