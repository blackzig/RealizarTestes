/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realizartestes;

import java.util.Random;
import org.junit.Test;

/**
 *
 * @author administrador
 */
public class TestUnit {

    TaxCalculator taxCalculator = new TaxCalculator();

    public final Double faixalSalarialM�nimoPagaImpostoNivel1 = 1566.62;
    public final Double taxaParaONivel1 = 0.075;
    public final Double faixalSalarialM�nimoPagaImpostoNivel2 = 2347.86;
    public final Double taxaParaONivel2 = 0.15;
    public final Double faixalSalarialM�nimoPagaImpostoNivel3 = 3130.52;
    public final Double taxaParaONivel3 = 0.225;
    public final Double faixalSalarialM�nimoPagaImpostoNivel4 = 3911.64;
    public final Double taxaParaONivel4 = 0.275;

    Double valorSalarioMaximoNivel1 = faixalSalarialM�nimoPagaImpostoNivel2 - 0.01;
    Double valorSalarioMaximoNivel2 = faixalSalarialM�nimoPagaImpostoNivel3 - 0.01;
    Double valorSalarioMaximoNivel3 = faixalSalarialM�nimoPagaImpostoNivel4 - 0.01;
    Double valorSalarioMaximoNivel4 = 4000.00;

    @Test
    public void insento() {
        try {
            Random gerador = new Random();
            Double maximoSalario = 4000.00;
            Double salario = gerador.nextDouble() * maximoSalario;

            System.out.println("salario " + salario);

            if (salario < faixalSalarialM�nimoPagaImpostoNivel1) {
                taxCalculator.calculoIRParaONivel0(salario);
            } else {
                taxCalculator.calculoIRParaONivelErro(salario);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    @Test
    public void nivel1() {
        try {
            Random gerador = new Random();
            Double maximoSalario = 4000.00;
            Double salario = gerador.nextDouble() * maximoSalario;

            System.out.println("salario " + salario);

            if (salario >= faixalSalarialM�nimoPagaImpostoNivel1 && salario < faixalSalarialM�nimoPagaImpostoNivel2) {
                taxCalculator.calculoIRParaONivel1(salario);
            } else {
                taxCalculator.calculoIRParaONivelErro(salario);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    @Test
    public void nivel2() {
        try {
            Random gerador = new Random();
            Double maximoSalario = 4000.00;
            Double salario = gerador.nextDouble() * maximoSalario;

            System.out.println("salario " + salario);

            if (salario >= faixalSalarialM�nimoPagaImpostoNivel2 && salario < faixalSalarialM�nimoPagaImpostoNivel3) {
                taxCalculator.calculoIRParaONivel2(salario);
            } else {
                taxCalculator.calculoIRParaONivelErro(salario);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    @Test
    public void nivel3() {
        try {
            Random gerador = new Random();
            Double maximoSalario = 4000.00;
            Double salario = gerador.nextDouble() * maximoSalario;

            System.out.println("salario " + salario);

            if (salario >= faixalSalarialM�nimoPagaImpostoNivel3 && salario < faixalSalarialM�nimoPagaImpostoNivel4) {
                taxCalculator.calculoIRParaONivel3(salario);
            } else {
                taxCalculator.calculoIRParaONivelErro(salario);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    @Test
    public void nivel4() {
        try {
            Random gerador = new Random();
            Double maximoSalario = 4000.00;
            Double salario = gerador.nextDouble() * maximoSalario;

            System.out.println("salario " + salario);

            if (salario >= faixalSalarialM�nimoPagaImpostoNivel4) {
                taxCalculator.calculoIRParaONivel4(salario);
            } else {
                taxCalculator.calculoIRParaONivelErro(salario);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
