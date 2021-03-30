package com.company;

import java.util.Scanner;

public class nilaitertentudandefault {

    public static void main(String[] args) {
        Scanner ade = new Scanner(System.in);
        Tabung coba1 = new Tabung();

        // Default
        System.out.println("== Contructor Nilai default ==");
        System.out.println("Nilai radius di Nilai default: "+ coba1.radius);
        System.out.println("Nilai Tinggi di Nilai default: "+ coba1.tinggi);
        System.out.println("Nilai Luas Alas Tabung: "+ coba1.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ coba1.getVolume());


        // Bebas
        System.out.println("\n\n== Contructor Nilai Bebas input ==");
        System.out.print("Masukkan Nilai Radius : ");
        double radius = ade.nextDouble();
        System.out.print("Masukkan Nilai Tinggi : ");
        double tinggi = ade.nextDouble();


        Tabung coba2 = new Tabung();
        coba2.radius = radius;
        coba2.tinggi = tinggi;

        System.out.println("Nilai radius di Nilai input : "+ radius);
        System.out.println("Nilai Tinggi di Nilai input : "+ tinggi);
        System.out.println("Nilai Luas Alas Tabung: "+ coba2.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ coba2.getVolume());

    }
}
