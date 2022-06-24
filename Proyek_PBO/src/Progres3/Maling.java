package Progres2;
import java.util.Random;

public class Maling{
    private int sisaNyawa = 100;
    private int posisiAkhir = 0;
    private boolean apakahMati = false;

    public Maling() {}

    public int ambilNyawa(){
        return this.sisaNyawa;
    }

    public int ambilPosisi(){
        return this.posisiAkhir;
    }

    public void bergerak(){
        Random rand = new Random();
        int arahTemabakan = rand.nextInt(3) - 1;
        this.posisiAkhir = arahTemabakan;
    }

    public void kena(int besarKerusakan){
        kurangiNyawa(besarKerusakan);
        if(ambilNyawa() <= 0){
            this.apakahMati = true;
        }
    }

    private void kurangiNyawa(int besarKerusakan){
        this.sisaNyawa -= besarKerusakan;
    }

    public boolean statusNyawa(){
        return this.apakahMati;
    }

    public void hidupKembali(){
        this.sisaNyawa = 100;
        this.apakahMati = false;
    }
}
