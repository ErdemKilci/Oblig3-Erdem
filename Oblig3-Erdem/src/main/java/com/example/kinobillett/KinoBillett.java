package com.example.kinobillett;

public class KinoBillett {

    private int id;
    private String film;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String telefonNummer;
    private String epost;

    // Constructors
    public KinoBillett() {
    }

    public KinoBillett(int id, String film, int antall, String fornavn, String etternavn, String telefonNummer, String epost) {
        this.id = id;
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonNummer = telefonNummer;
        this.epost = epost;
    }


    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "KinoBillett{" +
                "film='" + film + '\'' +
                ", antall=" + antall +
                ", fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", telefonNummer='" + telefonNummer + '\'' +
                ", epost='" + epost + '\'' +
                '}';
    }
}
