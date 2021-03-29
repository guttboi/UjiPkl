package com.java.belajar.baru.entity;

public class Identitas {

    public static class Baru {
        String nama;
        Integer absen;

        public void setNama(String nama){
            this.nama = nama;
        }

        public String getNama(){
            return nama;
        }

        public void setAbsen(Integer absen){
            this.absen = absen;
        }

        public Integer getAbsen(){
            return absen;
        }
    }
}
