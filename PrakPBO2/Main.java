package PrakPBO2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, ulang = 1;
        do{
            System.out.println("=================================");
            System.out.println("   MENGHITUNG BALOK DAN TABUNG ");
            System.out.println("=================================");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih \t : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                {
                    int panjang, lebar, tinggi;
                    System.out.print("Masukan Panjang\t:");
                    panjang = input.nextInt();
                    System.out.print("Masukan Lebar\t:");
                    lebar = input.nextInt();
                    System.out.print("Masukan Tinggi\t:");
                    tinggi = input.nextInt();
                    Balok balok = new Balok(tinggi, panjang, lebar);
                    System.out.println("Hasil");
                    System.out.println("Luas Persegi Panjang\t\t= " + balok.luas());
                    System.out.println("Keliling Persegi Panjang\t= " + balok.keliling());
                    System.out.println("Volume Balok\t\t\t= " + balok.volume());
                    System.out.println("Luas Permukaan Balok\t\t= " + balok.luasPermukaan());
                    break;
                }
                case 2:
                {
                    int tinggi, jariJari;
                    System.out.print("Masukan Tinggi\t:");
                    tinggi = input.nextInt();
                    System.out.print("Masukan Jari Jari\t:");
                    jariJari = input.nextInt();
                    Tabung tabung = new Tabung(tinggi, jariJari);
                    System.out.println("Luas Lingkaran\t\t= " + tabung.luas());
                    System.out.println("Keliling Lingkaran\t= " + tabung.keliling());
                    System.out.println("Volume Tabung\t\t= " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung\t= " + tabung.luasPermukaan());
                    break;
                }
                case 3:
                    ulang = 0;
                    System.out.print("Anda telah keluar dari program");
                    break;
                default:
                    System.out.println("\nOpsi tidak tersedia!\n");
            }
            if(ulang != 0){
                System.out.print("Anda ingin mengulangi program? Jika iya tekan 1 dan jika tidak maka tekan 0 : ");
                ulang = input.nextInt();
            }
        } while(ulang != 0);
    }
}