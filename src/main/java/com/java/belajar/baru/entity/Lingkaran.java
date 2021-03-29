package com.java.belajar.baru.entity;
import java.lang.Math;


public class Lingkaran {
    public static void main(String[] args) {
        Integer jariJari = 15;
        Integer diameter = jariJari * 2;
        Double phi = Math.PI;
        Double kelilingLingkaran = phi * diameter;
        System.out.println(String.format("Nilai phi %.2f, maka kelilingnya adalah %.2f", phi, kelilingLingkaran));



    }
}
