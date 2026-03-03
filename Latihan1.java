// Nama : Khairatul Husna Tartila
// NIM : 2400494
// Tugas latihan 1

import java.util.Scanner;
public class Latihan1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== Membuat perulangan kalimat sebanyak N kali ===");
        System.out.print("\n Masukkan jumlah N: ");
        int n = input.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("aku senang belajar bahasa java");
        }
    }
}