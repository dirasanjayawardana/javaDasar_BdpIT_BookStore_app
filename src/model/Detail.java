package model;

public class Detail {
    public static void main(String[] args) {
        User user1 = new User();
        // mengakses protected atribute dari class lain
        user1.lastName = "wardana";
        user1.greeting();
        System.out.println("last name : " + user1.lastName);

        // mengakses default atribute dari class lain
        user1.midName = "sanjaya";
        System.out.println("middelname : " + user1.midName);

        // mengakses atribute private dengan method setter dan getter
        user1.setEmail("user@gmail.com");
        System.out.println("email : " + user1.getEmail());
    }
}
