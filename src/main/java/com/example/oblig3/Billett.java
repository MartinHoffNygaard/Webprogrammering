package com.example.oblig3;

public class Billett implements Comparable<Billett>{

    private String film;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;

    public Billett(String film, String antall, String fornavn, String etternavn, String telefonnr, String epost) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }

    public int compareTo(Billett innbillett) {
        return this.etternavn.compareTo(innbillett.getEtternavn());
    }

    public Billett() {
    }

    public void setFilm(String film) {
        this.film = film;
    }
    public String getFilm() {
        return film;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }
    public String getAntall() {
        return antall;
    }
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public String getFornavn() {
        return fornavn;
    }
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
    public String getEtternavn() {
        return etternavn;
    }
    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }
    public String getTelefonnr() {
        return telefonnr;
    }
    public void setEpost(String epost) {
        this.epost = epost;
    }
    public String getEpost() {
        return epost;
    }
}
