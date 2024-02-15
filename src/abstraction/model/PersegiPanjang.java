package abstraction.model;

import abstraction.interfaces.BangunDatar;

// inheritance interface ke class (menggunakan implements), semua method dalam implement harus di override
public class PersegiPanjang implements BangunDatar {
    // attribute
    private Double panjang;
    private Double lebar;

    // constructor
    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // setter getter
    public Double getPanjang() {
        return panjang;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    public Double getLebar() {
        return lebar;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }

    // override method
    @Override
    public void characterShape() {
        System.out.println("""
                1. Punya 4 sisi
                2. Punya 4 titik sudut
                """);
    }

    @Override
    public Double getKeliling() {
        return (2 * this.panjang) + (2 * this.lebar);
    }

    @Override
    public Double getLuas() {
        return this.panjang*this.lebar;
    }

    @Override
    public void drawShape() {
        System.out.println("==== bangun persegi panjang ====");
        for (int i = 0; i < this.panjang; i++) {
            for (int j = 0; j < this.lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
