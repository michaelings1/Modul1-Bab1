public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;
    private double jarak;

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setKecepatan(int i){
        kecepatan = rubahKecepatan(i);
    }

    public void setWaktu(double w){
        waktu = rubahSekon(w);
    }

    private double rubahSekon(double jam){
        return jam * 3600;
    }

    private double rubahKecepatan(int k){
        return (k * 1000.0) / 3600.0;
    }

    public void hitungJarak(){
        jarak = kecepatan * waktu;
    }

    public void displayMessage(){

        hitungJarak();

        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.printf("dan mampu menempuh kecepatan %.2f m/s\n", kecepatan);
        System.out.printf("Jarak yang dapat ditempuh adalah %.2f km\n", (jarak / 1000));
    }
}