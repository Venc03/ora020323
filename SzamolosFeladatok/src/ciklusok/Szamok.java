package ciklusok;

import java.util.Scanner;

public class Szamok {

    public static void main(String[] args) {
        kiiras1();
    }

    private static void kiiras1() {
        Scanner sc = new Scanner(System.in, "latin2");
        System.out.println("\tLegyen ismetles? (i/n)");
        String bekeres = sc.next();
        boolean ismetles = bekeres.equals("i");

        int sz = 0;

        for (int r = 2; r <= 4; r++) {
            for (int x = 2; x <= 4; x++) {
                for (int i = 2; i <= 4; i++) {
                    if (!ismetles && (i == x || i == r || x == r)) {
                        continue;
                    }
                    sz++;
                    System.out.printf("\n" + i + "" + x + "" + r);
                }

            }

        }
        System.out.println("\n\tA szamok dbjanak osszege: " + sz);
    }

}
