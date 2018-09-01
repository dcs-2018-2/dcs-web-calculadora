package br.pro.ramon.dcs.web.calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    br.pro.ramon.dcs.web.calculadora.CalculadoraTest.class,
    br.pro.ramon.dcs.web.calculadora.CalculadoraServletTest.class,
    br.pro.ramon.dcs.web.calculadora.CalculadoraFormTest.class
})
public class AllTests {
}
