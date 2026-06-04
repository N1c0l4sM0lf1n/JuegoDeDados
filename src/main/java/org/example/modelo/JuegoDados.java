package org.example.modelo;

public class JuegoDados {

    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
        calculadora = new Calculadora();
    }

    public int obtenerSuma() {

        dado1.lanzar();
        dado2.lanzar();

        return calculadora.sumar(
                dado1.getCaraSuperior(),
                dado2.getCaraSuperior()
        );
    }

    public boolean jugar() {
        return obtenerSuma() == 7;
    }
}