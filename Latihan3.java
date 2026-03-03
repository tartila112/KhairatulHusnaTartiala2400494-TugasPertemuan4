// Nama : Khairatul Husna Tartila
// NIM : 2400494
// Tugas latihan 1

import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem akan Mengeuarkan Pembagi Bersama Terbesar dari dua buah bilangan a dan b ===");
        System.out.print("\n Masukkan bilangan a: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan b: ");
        int b = input.nextInt();
        if (a!=0 && b!=0){
            System.out.println("\n Proses mencari pembagi bersama terbesar dari " + a + " dan " + b);
            while (b !=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
            System.out.println("Pembagi bersama terbesar adalah: " + a);
        }
    }
}
