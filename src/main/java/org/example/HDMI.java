package org.example;

public class HDMI extends Colokan{

    public HDMI(int harga, double promisedBandWith, String merk) {
        super(harga, promisedBandWith, merk);
    }

    @Override
    public double getRealBandWith() {
        int hp = 50_000;
        double hasil = harga / hp;
        if (hasil < 1){
            double real = hasil * promisedBandWith;
            return real;
        }
        return getPromisedBandWith();
    }


}
