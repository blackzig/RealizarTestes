/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realizartestes;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author administrador
 */
public class RealizarTestesTest {

    public RealizarTestesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class RealizarTestes.
     */
    @Test
    public void testMain() {

        Random gerador = new Random();
        Double maximoSalario = 4000.00;
        double salario = gerador.nextDouble() * maximoSalario;
        //Double salario = 1566.62;
        System.out.println("Salário " + salario);

        TaxCalculator taxCalculator = new TaxCalculator();

        Double valorSalarioMinimoNivel1 = taxCalculator.getFaixalSalarialMínimoPagaImpostoNivel1();
        Double valorSalarioMinimoNivel2 = taxCalculator.getFaixalSalarialMínimoPagaImpostoNivel2();
        Double valorSalarioMinimoNivel3 = taxCalculator.getFaixalSalarialMínimoPagaImpostoNivel3();
        Double valorSalarioMinimoNivel4 = taxCalculator.getFaixalSalarialMínimoPagaImpostoNivel4();

        if (salario < valorSalarioMinimoNivel1) {
            taxCalculator.calculoIRParaONivel0(salario);
        } else if (salario >= valorSalarioMinimoNivel1 && salario < valorSalarioMinimoNivel2) {
            taxCalculator.calculoIRParaONivel1(salario);
        } else if (salario >= valorSalarioMinimoNivel2 && salario < valorSalarioMinimoNivel3) {
            taxCalculator.calculoIRParaONivel2(salario);
        } else if (salario >= valorSalarioMinimoNivel3 && salario < valorSalarioMinimoNivel4) {
            taxCalculator.calculoIRParaONivel3(salario);
        } else if (salario >= valorSalarioMinimoNivel4) {
            taxCalculator.calculoIRParaONivel4(salario);
        }

    }

}
