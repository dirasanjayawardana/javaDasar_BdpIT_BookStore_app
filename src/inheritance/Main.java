package inheritance;

// inheritance (mewariskan atribute dan method ke class lain/sub-class) 
// inheritanceke sesama jenis, antar class atau antar interface, menggunakan extends
// inheritance interface ke class, menggunakan implements

// static --> attribute atau method dipanggil dari class
// non-static --> attribute atau method dipanggil dari object

// polymorphsm --> method dengan nama yang sama dengan parameter berbeda, bisa jumlah parameternya, atau tipe data parameternya
// polymorphsm overload --> di dalam class yang sama bisa diduplicate dengan parameter yang berbeda
// polymorphsm override --> method dengan nama sama tapi dari class parent

public class Main {
    public static void main(String[] args) {
        // instance object dari parent class
        // NamaClass namaObjek = new Constructor();
        // constructor --> khusus untuk asign atribute saat pertama kali instance object
        Parent parent = new Parent();
        parent.setFirstName("dira");
        parent.setLastName("sanjaya");
        System.out.println(parent.getFullName());

        // ketika object si instance ulang, maka isi atribute akan reset dari awal
        parent = new Parent("Deni");
        System.out.println(parent.getFullName());

        // mengakses method staic (diakses dari class)
        Parent.getVersion();

        // instance child
        Child child = new Child("Sarjana", "andi");
        child.setLastName("pratama");
        System.out.println(child.getFullName());
        System.out.println(child.getGelar());

        // instance garndChild
        GrandChild grandChild = new GrandChild();
        grandChild.setFirstName("dodi");
        grandChild.setGelar("Sarjana");
        System.out.println(grandChild.getFullName());
        System.out.println(grandChild.getGelar());
    }
}
