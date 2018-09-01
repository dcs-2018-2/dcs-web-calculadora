package br.pro.ramon.dcs.web.calculadora;

import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraServletTest {

    @Test
    public void testSoma() throws IOException {
        String n1 = "10";
        String n2 = "20";
        String op = "+";

        String saida = acessaServletPelolNavegador(n1, n2, op);

        assertThat(saida, is("30.0"));
    }

    @Test
    public void testSubtracao() throws IOException {
        String n1 = "10";
        String n2 = "20";
        String op = "-";

        String saida = acessaServletPelolNavegador(n1, n2, op);

        assertThat(saida, is("-10.0"));
    }

    @Test
    public void testMultiplicacao() throws IOException {
        String n1 = "10";
        String n2 = "20";
        String op = "*";

        String saida = acessaServletPelolNavegador(n1, n2, op);

        assertThat(saida, is("200.0"));
    }

    @Test
    public void testDivisao() throws IOException {
        String n1 = "10";
        String n2 = "20";
        String op = "/";

        String saida = acessaServletPelolNavegador(n1, n2, op);

        assertThat(saida, is("0.5"));
    }

    private String acessaServletPelolNavegador(String n1, String n2, String op) throws IOException {
        Document html = Jsoup.connect("http://localhost:8084/dcs-web-calculadora/calculadora")
                .data("n1", n1)
                .data("n2", n2)
                .data("op", op)
                .get();

        String saida = html.body().text();

        return saida;
    }

}
