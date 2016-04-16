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

    public final Double faixalSalarialMínimoPagaImpostoNivel1 = 1566.62;
    public final Double taxaParaONivel1 = 0.075;
    public final Double faixalSalarialMínimoPagaImpostoNivel2 = 2347.86;
    public final Double taxaParaONivel2 = 0.15;
    public final Double faixalSalarialMínimoPagaImpostoNivel3 = 3130.52;
    public final Double taxaParaONivel3 = 0.225;
    public final Double faixalSalarialMínimoPagaImpostoNivel4 = 3911.64;
    public final Double taxaParaONivel4 = 0.275;

    Double valorSalarioMaximoNivel1 = faixalSalarialMínimoPagaImpostoNivel2 - 0.01;
    Double valorSalarioMaximoNivel2 = faixalSalarialMínimoPagaImpostoNivel3 - 0.01;
    Double valorSalarioMaximoNivel3 = faixalSalarialMínimoPagaImpostoNivel4 - 0.01;
    Double valorSalarioMaximoNivel4 = 4000.00;

    @Test
    public void insento() {
        try {
            Random gerador = new Random();
            Double maximoSalario = 4000.00;
            Double salario = gerador.nextDouble() * maximoSalario;

            System.out.println("salario " + salario);

            if (salario < faixalSalarialMínimoPagaImpostoNivel1) {
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

            if (salario >= faixalSalarialMínimoPagaImpostoNivel1 && salario < faixalSalarialMínimoPagaImpostoNivel2) {
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

            if (salario >= faixalSalarialMínimoPagaImpostoNivel2 && salario < faixalSalarialMínimoPagaImpostoNivel3) {
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

            if (salario >= faixalSalarialMínimoPagaImpostoNivel3 && salario < faixalSalarialMínimoPagaImpostoNivel4) {
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

            if (salario >= faixalSalarialMínimoPagaImpostoNivel4) {
                taxCalculator.calculoIRParaONivel4(salario);
            } else {
                taxCalculator.calculoIRParaONivelErro(salario);
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
