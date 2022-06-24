package Progres2;

public class Polisi {
    private String namaPolisi;
    public Polisi(String namaPolisi){
        this.namaPolisi =namaPolisi;
    }
    public String printNama(){
        return this.namaPolisi;
    }
    public boolean tembak(Awm awm, int arah, int posisiLawan){
        if(!awm.apaPeluruHabis()) awm.kurangiPeluru();

        if(arah != posisiLawan || awm.apaPeluruHabis()){
            return false;
        }
        return true;
    }

    public void aturNama(String namaPolisi){
        this.namaPolisi = namaPolisi;
    }

}
