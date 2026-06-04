package org.example.vista;

import org.example.modelo.JuegoDados;

public class Main {

    public static void main(String[] args) {

        JuegoDados juego = new JuegoDados();

        int suma = juego.obtenerSuma();

        System.out.println("Resultado: " + suma);

        if (suma == 7) {
            System.out.println("GANASTE");
        } else {
            System.out.println("PERDISTE");
        }
    }
}