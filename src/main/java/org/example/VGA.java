package org.example;

public class VGA extends Colokan{


    public VGA(int harga, double promisedBandWith, String merk) {
        super(harga, promisedBandWith, merk);
    }

    @Override
    public double getRealBandWith() {
        int hp = 30_000;
        double hasil = harga / (double) hp;
        if (hasil < 1){
            double real = hasil * promisedBandWith;
            return real;
        }
        return getPromisedBandWith();
    }



}
