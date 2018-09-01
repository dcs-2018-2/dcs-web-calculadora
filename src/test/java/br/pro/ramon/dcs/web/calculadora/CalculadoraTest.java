package br.pro.ramon.dcs.web.calculadora;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        double n1 = 10;
        double n2 = 20;
        String op = "+";

        Calculadora calculadora = new Calculadora();
        double saida = calculadora.calcula(n1, n2, op);

        assertThat(saida, is(30.0));
    }

    @Test
    public void testSubtracao() {
        double n1 = 10;
        double n2 = 20;
        String op = "-";

        Calculadora calculadora = new Calculadora();
        double saida = calculadora.calcula(n1, n2, op);

        assertThat(saida, is(-10.0));
    }

    @Test
    public void testMultiplicacao() {
        double n1 = 10;
        double n2 = 20;
        String op = "*";

        Calculadora calculadora = new Calculadora();
        double saida = calculadora.calcula(n1, n2, op);

        assertThat(saida, is(200.0));
    }

    @Test
    public void testDivisao() {
        double n1 = 10;
        double n2 = 20;
        String op = "/";

        Calculadora calculadora = new Calculadora();
        double saida = calculadora.calcula(n1, n2, op);

        assertThat(saida, is(0.5));
    }

}
