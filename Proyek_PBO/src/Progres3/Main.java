package Progres3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("----- Game Polisi Maling ----");
        System.out.println("ikuti insturksi permainan ini");
        System.out.println();

        System.out.print("Masukkan Nama Player =");
        String nama = scanner.nextLine();
        //nextline digunakan untuk membaca semua baris juga sapsi

        inisialisasiPermainan(nama);

        while(!maling.statusNyawa()){
            aksi();
            if(maling.statusNyawa()){
                tempat.naikLevel();
                maling.hidupKembali();
            }
        }
    }

    private static void tampilkanStatus(){
        System.out.println("+--------------------");
        System.out.println("|Nama         = "+ polisi.printNama());
        System.out.println("|Level        = "+tempat.AmbilLevel());
        System.out.println("|Nyawa maling = "+ maling.ambilNyawa());
        System.out.println("|Sisa peluru  = " + awm.ambilJumlahPeluru());
        System.out.println("+--------------------");
    }
    private static String masukanAksi(){
        System.out.println("+-------------+");
        System.out.println("|Tembak    =T |");
        System.out.println("|Isi peluru=R |");
        System.out.println("+-------------+");
        String pilihAksi = scanner.nextLine();
        return pilihAksi;
    }

    private static String TentukanArah(){
        System.out.println("Tentukan Arah tembakan:");
        System.out.println("Kiri=A   Tengah=W   Kanan:D");
        String masukanArahSasaran = scanner.nextLine();
        return masukanArahSasaran;
    }

    private static final Scanner scanner = new Scanner(System.in);
    static Tempat tempat = new Tempat(5);
    static Polisi polisi = new Polisi("Player");
    static Awm awm = new Awm("Senapan AWM", 10, 615, 100);
    static Maling maling = new Maling();

    private static void inisialisasiPermainan(String namaPolisi) {
        polisi.aturNama(namaPolisi);
    }

    private static int arahTembakan(String arahStr){
        //equalsIgnoreCase digunakan untuk membandingkan string ke objek tertentu.
        if(arahStr.equalsIgnoreCase("A")){
            return -1;
        } else if(arahStr.equalsIgnoreCase("D")){
            return 1;
        } else {
            return 0;
        }
    }

    private static void aksi(){
        tampilkanStatus();

        String aksi = masukanAksi();
        while(true){
            if(!awm.apaPeluruHabis()){
                if(aksi.equalsIgnoreCase("T")){
                    String arahStr = TentukanArah();
                    int arah = arahTembakan(arahStr);

                    maling.bergerak();

                    if(polisi.tembak(awm, arah, maling.ambilPosisi())){
                        maling.kena(awm.ambilKerusakan());
                        System.out.println("Sasaran kena");
                    } else {
                        System.out.println("Sasaran meleset");
                        System.out.println("Sasaran ke " + arahSasaran(maling));
                    }
                } else {
                    awm.isiUlang();

                    System.out.println("Peluru telah terisi");
                }
            }else{
                System.out.println("Permainan berakhir");
                System.exit(0);
            }
            break;
        }
    }

    private static String arahSasaran(Maling maling){
        switch(maling.ambilPosisi()){
            case -1:
                return "Kiri";
            case 0:
                return "Tengah";
            case 1:
                return "Kanan";
            default:
                return "Error";
        }
    }
}

/*======== link referensi =============
1.dicoding.com javafundamental basic
2.https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
3.https://codekey.id/java/switch-case-java/#:~:text=Switch%20case%20Java%20berguna%20untuk,Short%2C%20Int%2C%20dan%20Long.
4.
*/

