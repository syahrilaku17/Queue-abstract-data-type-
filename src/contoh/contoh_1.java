package contoh;

import java.util.ArrayDeque;
import java.util.Queue;

public class contoh_1 {
    public static void main (String [] args){
        Queue<String> _41170676_Syahril_Irfani_Fattah = new ArrayDeque<String>();
        _41170676_Syahril_Irfani_Fattah.add("Messi");
        _41170676_Syahril_Irfani_Fattah.add("Dembele");
        _41170676_Syahril_Irfani_Fattah.add("Suarez");
        _41170676_Syahril_Irfani_Fattah.add("Countinho");
        System.out.println("Data Antrian "+ _41170676_Syahril_Irfani_Fattah);
        System.out.println("Data terdepan " + _41170676_Syahril_Irfani_Fattah.element());
    }
}
