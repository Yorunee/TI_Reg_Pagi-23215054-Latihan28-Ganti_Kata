
package Pertemuan5;

import java.util.Scanner;


public class Latihan28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menampilkan header program
        System.out.println("====Program Mengganti Kata====");
        
        // Meminta input kalimat
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        
        // Meminta input kata yang akan diganti
        System.out.print("Ganti Kata : ");
        String kataLama = input.nextLine();
        
        // Meminta input kata pengganti
        System.out.print("Menjadi Kata : ");
        String kataBaru = input.nextLine();
        
        // Menyimpan kalimat awal
        String kalimatAwal = kalimat;
        
        // Mengganti semua kemunculan kata
        String kalimatBaru = kalimat.replaceAll(kataLama, kataBaru);
        
        // Menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimatAwal);
        System.out.println("Kalimat baru : " + kalimatBaru);
        
        input.close();
    }
}
