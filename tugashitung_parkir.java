import java.util.Scanner;
public class Variasi_Input{
      public static void main(String[]args){
        Scanner masukan_data = new Scanner(System.in);
        int tarif = 2000;
        int total_jam_parkir;
        int Hasil;
        System.out.println("SELAMAT DATANG DI SISTEM PARKIR");
        System.out.println("==============================");
        System.out.println("Masukan Jam Masuk");
        int jam_masuk = masukan_data.nextInt();
        System.out.println("Masukan Jam Keluar");
        int jam_keluar = masukan_data.nextInt();
        total_jam_parkir = jam_keluar - jam_masuk;
        Hasil =  total_jam_parkir * tarif;
        System.out.println("Total Yang Harus Di Bayar RP." +Hasil);

    } 
}