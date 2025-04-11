package mains;

import java.util.Scanner;
import shapes.LimasPersegi;
import shapes.PrismaSegitigaSamaKaki;
import shapes.Tabung;


public class Main {
    public static void main(String[] args) {
        Scanner hadeh = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.print("Masukkan Nama  : ");
        String nama = hadeh.nextLine();
        System.out.print("Masukkan NIM   : ");
        String nim = hadeh.nextLine();
        System.out.println("=============================================");

 
        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("=============================================");
        System.out.print("Isikan alas    : ");
        double alas = hadeh.nextDouble();
        System.out.print("Isikan kaki    : ");
        double kaki = hadeh.nextDouble();
        System.out.print("Isikan tinggi  : ");
        double tinggiPrisma = hadeh.nextDouble();
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        System.out.println("=============================================");
        prisma.printInfo();
        System.out.println("=============================================");

    
        System.out.println("Limas Persegi");
        System.out.println("=============================================");
        System.out.print("Isikan sisi    : ");
        double sisi = hadeh.nextDouble();
        System.out.print("Isikan tinggi  : ");
        double tinggiLimas = hadeh.nextDouble();
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        System.out.println("=============================================");
        limas.printInfo();
        System.out.println("=============================================");


        System.out.println("Tabung");
        System.out.println("=============================================");
        System.out.print("Isikan radius  : ");
        double radius = hadeh.nextDouble();
        System.out.print("Isikan tinggi  : ");
        double tinggiTabung = hadeh.nextDouble();
        Tabung tabung = new Tabung(radius, tinggiTabung);
        System.out.println("=============================================");
        tabung.printInfo();
        System.out.println("=============================================");
    }
}


