package com.java.belajar.baru;

import com.java.belajar.baru.App;
import com.java.belajar.baru.entity.Identitas;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    String dani = "dani";

        String nama;

        public void setNama(String nama){
            this.nama = nama;
        }

        public String getNama(){
            return nama;
        }

    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        App app = new App();
        Integer inputAbsen = scan.nextInt();
        Identitas.Baru baru = new Identitas.Baru();
        baru.setAbsen(inputAbsen);
        app.setNama(input);
        String nama = app.getNama();
        System.out.println("nama : " + nama + " Absen : " + baru.getAbsen());
    }

}
