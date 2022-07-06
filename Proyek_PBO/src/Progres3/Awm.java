package Progres3;

public class Awm {
    private final String jenis;
    private final int maksimalPeluru;
    private int jumlahPeluru;
    private final int diameter;
    private final int nyawa;

    public Awm(String jenis, int maksimalPeluru, int diameter, int nyawa) {
        this.jenis = jenis;
        this.maksimalPeluru = maksimalPeluru;
        this.jumlahPeluru = maksimalPeluru;
        this.diameter = diameter;
        this.nyawa = nyawa;
    }

    public void isiUlang(){
        this.jumlahPeluru = this.maksimalPeluru;
    }

    public String ambilJenis(){
        return this.jenis;
    }

    public int ambilDiameter(){
        return this.diameter;
    }

    public int ambilKerusakan(){
        return this.nyawa;
    }

    public int ambilJumlahPeluru(){
        return this.jumlahPeluru;
    }

    public void kurangiPeluru(){
        this.jumlahPeluru--;
    }

    public boolean apaPeluruHabis(){
        return (ambilJumlahPeluru() == 0);
    }
}
