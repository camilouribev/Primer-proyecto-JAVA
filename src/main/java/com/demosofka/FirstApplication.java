package com.demosofka;

import java.util.Scanner;

public class FirstApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de usuario:");
        String nombre = scanner.nextLine();
        System.out.println("Celular:");
        long numero = scanner.nextLong();
        System.out.println("Edad:");
        int edad = scanner.nextInt();

        System.out.println("Bienvenido señor " + nombre + ", es un placer para nosotros contar con una persona de " + edad + " años. \n" +
                "Próximamente nos comunicaremos con usted al numero " + numero + ". Feliz día!!!");

        System.out.println("edad = " + edad);
        scanner.close();
    }
}



