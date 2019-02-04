package contoh;

public class contoh_4 {
    int ar_41170676_SYahril_Irfani_Fattah[] = new int [10];
    int top_41170676_Syahril_Irfani_Fattah = -1;
    int down_41170676_Syahril_Irfani_Fattah = 0;

    public void enqueue(int angka){
        if(!isFull()){
            top_41170676_Syahril_Irfani_Fattah++; // TOP DI NAIKAN
            ar_41170676_SYahril_Irfani_Fattah[top_41170676_Syahril_Irfani_Fattah] = angka; // ANGKA DI ISIKAN
            System.out.println("Angq4 " + angka + " berhasil di enqueue");
        }else{
            System.out.println("Antrian penuh");
        }
    }
    public void dequeue(){
        if(!isEmpty()){
            int indexDown = down_41170676_Syahril_Irfani_Fattah;
            down_41170676_Syahril_Irfani_Fattah++; // DOWN DI NAIKAN
            System.out.println("Antrian indek " + indexDown  + " berhasil di dequeue");
        }else{
            System.out.println("Antrian kosong");
        }
    }
    public void view(){
        if(!isEmpty()){
            System.out.print("Isi Antrian seq4rang : ");
            for (int i = down_41170676_Syahril_Irfani_Fattah; i <= top_41170676_Syahril_Irfani_Fattah; i++) {
                System.out.print( ar_41170676_SYahril_Irfani_Fattah[i] + " ");
            }
            System.out.println("");
        }else{
            System.out.println("Antrian kosong");
        }
    }
    boolean isFull(){
        if(top_41170676_Syahril_Irfani_Fattah == ar_41170676_SYahril_Irfani_Fattah.length){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(top_41170676_Syahril_Irfani_Fattah == -1){
            return true;
        }
        return false;
    }
    public static void main(String [] suroso){
        contoh_4 q4 = new contoh_4();
        q4.enqueue(3);
        q4.view();
        q4.enqueue(6);
        q4.enqueue(7);
        q4.view();
        q4.dequeue();
        q4.view();
        q4.dequeue();
        q4.view();
    }
}
