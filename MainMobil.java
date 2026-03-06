//Nama : Michael Renanda
//Kelas : TI - B
//NIM : 255150707111027
import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mobil m1 = new Mobil();

        System.out.print("Masukkan Manufaktur Mobil : ");
        m1.setManufaktur(input.nextLine());

        System.out.print("Masukkan No Plat : ");
        m1.setNoPlat(input.nextLine());

        System.out.print("Masukkan Warna Mobil : ");
        m1.setWarna(input.nextLine());

        System.out.print("Masukkan Kecepatan (km/h) : ");
        m1.setKecepatan(input.nextInt());

        System.out.print("Masukkan Waktu Tempuh (jam) : ");
        double waktu = input.nextDouble();
        m1.setWaktu(waktu);

        m1.displayMessage();
    }
}