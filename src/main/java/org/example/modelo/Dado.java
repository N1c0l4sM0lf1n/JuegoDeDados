package org.example.modelo;

import java.util.Random;

public class Dado {

    private int caraSuperior;

    public Dado() {
        caraSuperior = 1;
    }

    public void lanzar() {
        Random random = new Random();
        caraSuperior = random.nextInt(6) + 1;
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }
}