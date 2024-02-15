package model;

// modifier public --> bisa diakses secara global
public class User {
    // atribute (modifiernya ada public, protected, default, private)
    public String username = "dira";
    // protected (bisa diakses package yang sama atau turunan classnya)
    protected String lastName = "lastname";
    // default/tanpa modifier (hanya bisa di package yang sama)
    String midName = "midname";
    // private (hanya bisa diakses oleh classnya sendiri)
    private String email;

    // setter getter untuk mengakses atribute private di class java
    public void setEmail(String email) {
        if(email == null){
            throw new RuntimeException("email is required");
        }
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    protected void greeting(){
        System.out.println("hello from user class");
    }
}

// default/tanpa modifier (hanya bisa di package yang sama)
class DetailUser {

}