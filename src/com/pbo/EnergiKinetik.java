package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung energi kinetik dan besarnya usaha yang dikeluarkan
 *
 */

public class EnergiKinetik {

    private double mass;
    private double velocity;

    public double getMass() {
        return mass;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * this.mass * Math.pow(this.velocity, 2);
    }

    public double hitungUsaha(double mass, double velocity) {

        double vt = Math.pow(velocity, 2);
        double as = vt / 2;
        double w = as * mass;

        return w;
    }

    public static void main(String[] args) {
	    EnergiKinetik energiKinetik = new EnergiKinetik();
        energiKinetik.setMass(145);
        energiKinetik.setVelocity(25);
        double massa = energiKinetik.getMass();
        double kecepatan = energiKinetik.getVelocity();

        System.out.println("Massa\t\t= " + energiKinetik.getMass());
        System.out.println("Kecepatan\t= " + energiKinetik.getVelocity());
        System.out.println("Energi Kinetik\t= " + energiKinetik.hitungEnergiKinetik());
        System.out.println("Besarnya usaha yang dilakukan = " + energiKinetik.hitungUsaha(massa, kecepatan));
    }
}
