package org.example;

public abstract class Colokan {
    String merk;
    double promisedBandWith;
    int harga;

    public Colokan(int harga, double promisedBandWith, String merk) {
        this.merk = merk;
        this.promisedBandWith = promisedBandWith;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Double getPromisedBandWith() {
        return promisedBandWith;
    }

    public void setPromisedBandwith(Double promisedBandWith) {
        this.promisedBandWith = promisedBandWith;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public abstract double getRealBandWith();
}
