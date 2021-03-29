package com.java.belajar.baru.entity;

public class PersegiPanjang {
    private static Integer panjang, tinggi;
    public static void main(String[] args) {

        panjang = 15;
        tinggi = 5;
        Integer luasPersegiPanjang = panjang * tinggi;
        Integer kelilingPersegiPanjang = 2 * panjang +  2 * tinggi;
        System.out.println(String.format("Tinggi %scm, dan Panjang %scm maka luas persegi panjang adalah %s" ,panjang, tinggi, luasPersegiPanjang));

        System.out.println(String.format("Tinggi %scm, dan Panjang %scm maka keliling persegi panjang adalah %s" ,panjang, tinggi, kelilingPersegiPanjang));

    }
}
