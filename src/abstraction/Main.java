package abstraction;

import java.util.Scanner;

import abstraction.model.Lingkaran;
import abstraction.model.PersegiPanjang;

// cara lain instance object (namaInterface namaObject = new namaClass();)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selected = "";
        Boolean retry = true;

        try {
            while (retry) {
                System.out.println("""
                        ==== Shape Menu ===
                        1. Persegi panjang
                        2. Lingkaran
                        3. 
                        """);
                System.out.print("Select menu: ");
                selected = scanner.nextLine();

                switch (selected) {
                    case "1":
                        System.out.println("==== Persegi panjang ====");

                        System.out.print("Input panjang: ");
                        Double panjang = scanner.nextDouble(); // untuk input number bisa gunakan nextDouble() atau
                                                               // nextInt(), tetapi haru menambahkan nextLine()
                                                               // dibawahnya
                        scanner.nextLine();

                        System.out.print("Input Lebar: ");
                        Double lebar = Double.valueOf(scanner.nextLine());

                        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                        pp.drawShape();
                        pp.characterShape();
                        System.out.println("Keliling: " + pp.getKeliling());
                        System.out.println("Luas: " + pp.getLuas());

                        break;

                    case "2":
                        System.out.println("==== Persegi panjang ====");

                        System.out.print("Input panjang: ");

                        System.out.print("Input jari-jari: ");
                        Double radius = Double.valueOf(scanner.nextLine());

                        Lingkaran lingkaran = new Lingkaran(radius);
                        lingkaran.drawShape();
                        lingkaran.characterShape();
                        System.out.println("Keliling: " + lingkaran.getKeliling());
                        System.out.println("Luas: " + lingkaran.getLuas());

                        break;

                    default:
                        System.out.println("Input invalid!");

                        break;
                }

                while (true) {
                    System.out.print("Ingin keluar program?(y/n): ");
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("y")) {
                        retry = false;
                        break;
                    } else if (answer.equalsIgnoreCase("n")) {
                        retry = true;
                        break;
                    } else {
                        System.out.println("Input salah");
                        continue;
                    }
                }
            }

            System.out.println("Program selesai...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
