public class Buku {

    String judul;
    String kategori;
    Penulis penulis;

    public Buku(String judul, String kategori, Penulis penulis) {
        this.judul = judul;
        this.kategori = kategori;
        this.penulis = penulis;
    }

    public void tampilkan() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Penulis    : " + penulis.nama);
        System.out.println();
    }

}