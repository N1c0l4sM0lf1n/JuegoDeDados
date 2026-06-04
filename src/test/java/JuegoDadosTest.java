import org.example.modelo.Calculadora;
import org.example.modelo.Dado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JuegoDadosTest {

    @Test
    public void testSumaCalculadora() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(3, 4);

        assertEquals(7, resultado);
    }

    @Test
    public void testLanzamientoDado() {

        Dado dado = new Dado();

        dado.lanzar();

        int valor = dado.getCaraSuperior();

        assertTrue(valor >= 1 && valor <= 6);
    }
}