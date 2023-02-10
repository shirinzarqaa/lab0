package Java;
import java.util.Scanner;

public class nilai{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Asli: ");
        double nilaiAsli = input.nextDouble();
        System.out.print("Masukkan Durasi: ");
        int durasi = input.nextInt();
        double nilaiAkhir ;


        if(durasi < 60){
            nilaiAkhir = 1.2 * nilaiAsli;
        } else if(durasi >= 60 && durasi <=70){
            nilaiAkhir = nilaiAsli;
        } else if(durasi> 70 && durasi < 90){
            nilaiAkhir = 0.75 * nilaiAsli;
        } else if(durasi >= 90 && durasi <= 100){
            nilaiAkhir = 0.5 * nilaiAsli;
        } else{
            nilaiAkhir = 0.2 * nilaiAsli;
        }
        System.out.println( nama + " mendapatkan nilai akhir " + nilaiAkhir);
    }

}
