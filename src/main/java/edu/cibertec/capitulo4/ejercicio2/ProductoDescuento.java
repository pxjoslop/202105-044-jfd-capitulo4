package edu.cibertec.capitulo4.ejercicio2;

import java.util.Scanner;

public class ProductoDescuento {

    public static void main(String[] args) {
        int descuento = 2;
        boolean rpta;
        int num = 2;
        int x = 1;
        int total = 0;
        while (num >= x) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Producto con Descuento TRUE/FALSE");

            rpta = scan.nextBoolean();
            if (rpta) {
                System.out.println("Ingrese Precio Producto " + x);
                try {
                    total = scan.nextInt() + total - descuento;
                } catch (Exception e) {
                    System.out.println("Error de Formato Númerico " + e);
                }
            } else {
                System.out.println("Ingrese Precio Producto " + x);
                try {
                    total = scan.nextInt() + total;
                } catch (Exception e) {
                    System.out.println("Error de Formato Númerico " + e);
                }
            }
            x++;
        }
        System.out.println("Total Sumatoria de Productos " + total);
    }

}
