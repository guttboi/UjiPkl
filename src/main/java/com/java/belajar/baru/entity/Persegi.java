package com.java.belajar.baru.entity;

public class Persegi {
    public static void main(String[] args) {
        Double sisi = new Double(50);
        Double hasil = sisi * sisi;
        Double kel = 4 * sisi;
        System.out.println(String.format("Dengan sisi %scm maka luas persegi tersebut adalah %sm", sisi, (hasil/100)));

        System.out.println(String.format("Dengan sisi %scm maka keliling persegi tersebut adalah %sm", sisi, (kel/100)));

    }
}
