package Progres2;

public class Tempat {
    private int levelSekarang = 1;
    public int level;

    public Tempat(int level){
        this.level = level;
    }

    public int AmbilLevel(){
        return this.levelSekarang;
    }

    public void naikLevel(){
        this.levelSekarang++;
    }
}
