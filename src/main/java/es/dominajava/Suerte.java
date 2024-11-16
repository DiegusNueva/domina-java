package es.dominajava;

import java.security.SecureRandom;
import java.util.Random;

public class Suerte {
    public static void main(String[] args) {
//        System.out.println("... con Math.random()");
//        for (int i = 0; i < 10; i++) {
//            double d = Math.random();
//            System.out.println(d);
//            System.out.println("\t" + (d <= 0.3));
//            System.out.println("\t" + (int) (d * 10));
//            System.out.println();
//        }
//
//        System.out.println("... con Math.random()");
        Random r = new Random();
//        Random s = new Random(987654321);
//        Random t = new Random(987654321);
//        for (int i = 0; i < 10; i++) {
//            int nr = r.nextInt();
//            int ns = r.nextInt();
//            int nt = r.nextInt();
//            System.out.println(nr);
//            System.out.println("\t" + ns);
//            System.out.println("\t" + nt);
//            System.out.println();
//        }
//
//        System.out.println("... ... varios tipos");
//        for (int i = 0; i < 10; i++) {
//            int n = r.nextInt();
//            int edad = r.nextInt(100);
//            boolean b = r.nextBoolean();
//            byte[] bytes = new byte[8];
//            r.nextBytes(bytes);
//            System.out.println(n);
//            System.out.println("\t" + edad);
//            System.out.println("\t" + b);
//            System.out.println("\t" + new String(bytes));
//            System.out.println();
//        }
//
//        System.out.println("... ... con SecureRandom");
//        SecureRandom sr = new SecureRandom();
//        for (int i = 0; i < 10; i++) {
//            int n = sr.nextInt();
//            int edad = sr.nextInt(100);
//            boolean b = sr.nextBoolean();
//            byte[] bytes = new byte[8];
//            sr.nextBytes(bytes);
//            System.out.println(n);
//            System.out.println("\t" + edad);
//            System.out.println("\t" + b);
//            System.out.println("\t" + new String(bytes));
//            System.out.println();
//        }

        System.out.println("Ejemplos concretos");
        int min = -10;
        int max = 10;
        System.out.println("Números entre " + min + " y " + max);
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(max - min + 1) + min;
            System.out.println(num + " ");
        }
        System.out.println();

        System.out.println("Nombre de niña: ");
        Nombres[] posibles = Nombres.values();
        int pos = r.nextInt(posibles.length);
        Nombres nombre = posibles[pos];
        System.out.println(nombre);

        System.out.println("Matrículas: ");
        char[] alfabeto = "BCDFGHJKLMNPRSTVWXYZ".toCharArray();
        for (int i = 0; i < 10 ; i++) {
            r.ints(4, 0, 10).forEach(n-> System.out.print(n));
            r.ints(3, 0, alfabeto.length).forEach(n -> System.out.print(alfabeto[n]));
            System.out.println();
        }
    }
}

enum Nombres {
    MARIA, MARTA, MARINA, MARTINA, MAR;
}
