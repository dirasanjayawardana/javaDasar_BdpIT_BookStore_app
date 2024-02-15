import java.util.Scanner;

import model.User;

public class App {
    public static void main(String[] args) throws Exception {
        User user1 = new User();

        user1.username = "user01";
        // user1.lastName = "sanjaya"; // tidka bisa mengakses atribute protected dan
        // default karena berada di package berbeda
        System.out.println(user1.username);

        // tipe data primitive (tidak memiliki reffrence class)
        int integer = 80;
        String hello = "constoh string";

        // percabangan menggunakan scanner
        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.print("Input Opsi : ");
            String opsi = scanner1.nextLine();
            switch (opsi) {
                case "A":
                    System.out.println("Opsi A");
                    break;
                case "B":
                    System.out.println("Opsi B");
                    break;
                case "C":
                    System.out.println("Opsi C");
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            scanner1.close();
        }

        // perulangan (menampilkan angka yang sama dari dua array)
        int[] array1 = { 2, 3, 4, 5 };
        int[] array2 = { 1, 3, 5, 7 };
        // menggunakan for biasa
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i] + " ");
                }
            }
        }
        // menggunakan foreach (enhanced for loop)
        for (var value1 : array1) {
            for (var value2 : array2) {
                if (value1 == value2) {
                    System.out.println(value1 + " ");
                }
            }
        }

        // mengurutkan array yang tidak urut
        int[] array3 = { 3, 2, 5, 4, 6 };
        int temp = 0;

        for (int i = 0; i < array3.length - 1; i++) {
            for (int j = 1 + i; j < array3.length; j++) {
                if (array3[i] > array3[j]) {
                    temp = array3[i];
                    array3[i] = array3[j];
                    array3[j] = temp;
                }
            }
        }

        for (int i : array3) {
            System.out.print(i + " ");
        }
    }
}
