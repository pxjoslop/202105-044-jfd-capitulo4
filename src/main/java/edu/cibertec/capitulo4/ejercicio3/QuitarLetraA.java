package edu.cibertec.capitulo4.ejercicio3;

import java.util.Scanner;

public class QuitarLetraA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        System.out.print("Ingrese la frase: ");
        frase = scan.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'A') {
                continue;
            }
            System.out.print(caracter);
        }
    }
}
