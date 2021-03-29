package com.java.belajar.baru.entity;

public class StringHello {
    public static void main(String[] args) {
        String str = "h,e,l,l,o";
        System.out.println("Sebelum dibalik :"+str);
        int length = str.length();

        String akhir = "";
        for (int i = length -1; i >= 0; i-- ){
            akhir = akhir + str.charAt(i);
        }
        System.out.println("Setelah dibalik : "+akhir);
    }
}
