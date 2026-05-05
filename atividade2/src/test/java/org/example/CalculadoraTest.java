package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void somar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void subtrair() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(5, 2);
        assertEquals(3, resultado);
    }

    @Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    void dividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void dividirPorZero() {
        Calculadora calculadora = new Calculadora();

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }

    @Test
    void somarNegativos() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(-2, 3);
        assertEquals(1, resultado);
    }

    @Test
    void multiplicarDecimais() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(2.5, 2);
        assertEquals(5.0, resultado);
    }

    @Test
    void somarDecimais() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(2.5, 3.2);
        assertEquals(5.7, resultado);
    }

    @Test
    void subtrairNegativos() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.subtrair(-5, -3);
        assertEquals(-2, resultado);
    }

    @Test
    void multiplicarNegativos() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(-4, -2);
        assertEquals(8, resultado);
    }

    @Test
    void dividirDecimal() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(7, 2);
        assertEquals(3.5, resultado);
    }

    @Test
    void somarZeros() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(0, 0);
        assertEquals(0, resultado);
    }

    @Test
    void multiplicarPorZero() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(100, 0);
        assertEquals(0, resultado);
    }

    @Test
    void somarNumerosGrandes() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.somar(999999999, 1);
        assertEquals(1000000000, resultado);
    }

    @Test
    void dividirNegativoPorPositivo() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(-15, 3);
        assertEquals(-5, resultado);
    }
}