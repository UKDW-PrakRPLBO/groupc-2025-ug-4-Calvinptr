package org.example;

public class TV {
    private Colokan colokan;
    int maxResolusi;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

    public int getResolution(){
        double colok = colokan.getRealBandWith();
        double maxResolution = maxResolusi;
        if(colok < 10) {
            maxResolusi = 0;
        } else if (colok >= 10 && colok <= 35){
            maxResolusi = 480;
        } else if (colok > 35 && colok <= 100) {
            maxResolusi = 720;
        } else if (colok > 100 && maxResolusi != 720){
            maxResolusi = 1080;
        }
        return Math.min(this.maxResolusi, maxResolusi);
    }
}
