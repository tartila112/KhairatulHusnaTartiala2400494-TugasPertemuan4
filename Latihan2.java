// Nama : Khairatul Husna Tartila
// NIM : 2400494
// Tugas latihan 1

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem akan mengeluarkan deretan angka genap ===");
        System.out.print("\nMasukkan batas awal: ");
        int awal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();

        System.out.println("Deretan angka genap antara " + awal + " dan " + akhir + ":");
        for (int i = awal; i<= akhir; i++){
            if(i %2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
