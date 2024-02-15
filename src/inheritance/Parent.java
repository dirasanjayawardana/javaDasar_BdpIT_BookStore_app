package inheritance;

// inheritance (mewariskan atribute dan method ke class lain/sub-class) 
// inheritanceke sesama jenis, antar class atau antar interface, menggunakan extends
// inheritance interface ke class, menggunakan implements

public class Parent {
    private String firstName;
    private String lastName;
    private static final String VERSION = "1.0";

    // constructor dengan parameter
    public Parent(String namaDepan) {
        this.firstName = namaDepan;
    }

    // constructor tanpa parameter
    public Parent() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public static void getVersion() {
        System.out.println("versi : " + VERSION);
    }

}
