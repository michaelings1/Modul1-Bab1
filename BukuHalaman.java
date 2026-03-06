public class BukuHalaman {

    int jumlahHalaman = 50;
    double halamanPerHari = 0.5;

    public double hitungHari(){
        return jumlahHalaman / halamanPerHari;
    }

    public void display(){
        System.out.println("Jumlah halaman buku : " + jumlahHalaman);
        System.out.println("Halaman ditulis per hari : " + halamanPerHari);
        System.out.println("Hari untuk menghabiskan buku : " + (int)hitungHari());
    }
}