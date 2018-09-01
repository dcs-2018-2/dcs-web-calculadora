package br.pro.ramon.dcs.web.calculadora;

import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraFormTest {

    @Test
    public void testForm() throws IOException {
        Document html = Jsoup.connect("http://localhost:8084/dcs-web-calculadora/index.html").get();

        Elements forms = html.getElementsByTag("form");

        Element form = forms.get(0);
        assertThat(form.attr("action"), is("calculadora"));
        assertThat(form.attr("method"), is("GET"));

        Elements entradas = form.children();

        Element n1Input = entradas.get(0);
        assertThat(n1Input.tagName(), is("input"));
        assertThat(n1Input.attr("type"), is("text"));
        assertThat(n1Input.attr("name"), is("n1"));

        Element opSelect = entradas.get(1);
        assertThat(opSelect.tagName(), is("select"));
        assertThat(opSelect.attr("name"), is("op"));

        Elements options = opSelect.children();
        assertThat(options.size(), is(4));
        assertThat(options.get(0).text(), is("+"));
        assertThat(options.get(1).text(), is("-"));
        assertThat(options.get(2).text(), is("*"));
        assertThat(options.get(3).text(), is("/"));

        Element n2Input = entradas.get(2);
        assertThat(n2Input.tagName(), is("input"));
        assertThat(n2Input.attr("type"), is("text"));
        assertThat(n2Input.attr("name"), is("n2"));

        Element calculaButton = entradas.get(3);
        assertThat(calculaButton.tagName(), is("input"));
        assertThat(calculaButton.attr("type"), is("submit"));
        assertThat(calculaButton.attr("value"), is("="));
    }

}
