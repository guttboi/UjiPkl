package com.java.belajar.baru.testPKL;

public class RecursiveFunction {

    public static void main(String[] args) {
        String str = "SEMANGAT !" ;
        String reverse = ReverseString(str)
                ;
        System.out.println(": SEMANGAT ! = " + reverse);
    }

    public static String ReverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //manggil fungsi rekursif
        return ReverseString(str.substring(1)) + str.charAt(0);
    }
}
