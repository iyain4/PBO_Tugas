package Tugas1;
import java.util.Scanner;

public class main {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ulang;
        double celcius;
        System.out.println("----------------------------");
        System.out.println(" PROGRAM KONVERSI SUHU AIR ");
        System.out.println("----------------------------");
        System.out.println("Menu Input Data");
        System.out.println("----------------------------");
        System.out.print("Suhu Dalam Celcius\t: ");
        celcius = input.nextDouble();
        do{
            konversi suhuCelcius = new konversi(celcius);
            System.out.println("");
            System.out.println("Daftar Menu");
            System.out.println("----------------------------");
            System.out.println("1. Lihat Data Konversi ");
            System.out.println("2. Edit Data Konversi ");
            System.out.println("3. Keluar ");
            System.out.print("Silahkan masukan pilihan \t: ");
            ulang=input.nextInt();
            if(ulang == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + celcius + "°C");
                System.out.println("Dalam Fahrenheit\t: " + suhuCelcius.konversiFahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + suhuCelcius.konversiReamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + suhuCelcius.konversiKelvin() + "K");
                if(celcius<=0){
                    System.out.println("Kondisi air dalam keadaan beku");
                }
                else if(celcius>=100){
                    System.out.println("Kondisi air dalam keadaan mendidih");
                }
                else {
                    System.out.println("Kondisi air dalam keadaan normal");
                }
            }
            else if(ulang == 2){
                System.out.println("\nMasukan Data");
                System.out.println("----------------------------");
                System.out.print("Suhu Dalam Celcius\t: ");
                celcius = input.nextDouble();
            }
            else if(ulang != 3){
                System.out.println("\n\n ");
                System.out.println("----------------------------");
                System.out.println("Input yang anda masukan salah, \nsilahkan pilih kembali menu :)");
                System.out.println("----------------------------");
            }
        }while(ulang!=3);
    }
    

}
