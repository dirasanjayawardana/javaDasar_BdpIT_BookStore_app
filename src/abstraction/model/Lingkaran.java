package abstraction.model;

import abstraction.interfaces.BangunDatar;

public class Lingkaran implements BangunDatar {

    // atribute
    private Double radius;

    // constructor
    public Lingkaran(Double radius) {
        this.radius = radius;
    }

    // setter getter
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void drawShape() {
        System.out.println("==== bangun lingkaran ====");
    }

    @Override
    public void characterShape() {
        System.out.println("""
                1. Punya jari-jari
                2. Tidak punya sudut
                """);
    }

    @Override
    public Double getKeliling() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public Double getLuas() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

}
