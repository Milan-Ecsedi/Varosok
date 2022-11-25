package com.example.varosok;

public class City {

    private int id;
    private String nev;
    private String orszag;
    private int lakossag;


    public City(int id, String nev, String orszag, int lakossag) {
        this.id = id;
        this.nev = nev;
        this.orszag = orszag;
        this.lakossag = lakossag;
    }


    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public String getOrszag() {
        return orszag;
    }

    public int getLakossag() {
        return lakossag;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }

    public void setLakossag(int lakossag) {
        this.lakossag = lakossag;
    }
}
