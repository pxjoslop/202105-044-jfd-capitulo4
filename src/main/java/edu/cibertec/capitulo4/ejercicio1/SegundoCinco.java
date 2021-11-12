package edu.cibertec.capitulo4.ejercicio1;

import java.util.Calendar;

public class SegundoCinco {

    public static void main(String[] args) {
        try {
            while (true) {
                int segundo = Calendar.getInstance().get(Calendar.SECOND);
                System.out.println("segundo = " + segundo);
                if (segundo % 10 == 0) {
                    break;
                }
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
        }
    }

}
