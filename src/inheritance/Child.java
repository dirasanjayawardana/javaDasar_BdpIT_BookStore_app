package inheritance;

public class Child extends Parent {
    private String gelar;

    public Child() {

    }

    public Child(String gelar, String namaDepan) {
        super(namaDepan);
        this.gelar = gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getGelar() {
        return super.getFullName();
    }

    // override
    @Override
    public String getFullName(){
        return super.getFullName() + ", " + this.gelar;
    }

}
