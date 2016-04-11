/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realizartestes;

import realizartestes.servicos.ValorEsperado;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author administrador
 */
public class TaxCalculator {

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

    ValorEsperado ve = new ValorEsperado();

    public void calculoIRParaONivel0(Double salario) {
        try {
            System.out.println("Salário: " + salario + " isento de imposto.");
            assertEquals(0, 0, 0);
        } catch (Exception e) {
            System.out.println("Erro calculaIR " + e.getMessage());
        }
    }

    public void calculoIRParaONivel1(Double salario) {
        try {
            Double valorMinimoEsperadoNivel1 = ve.retorneOValorEsperado(faixalSalarialMínimoPagaImpostoNivel1, taxaParaONivel1);
            Double valorMaximoEsperadoNivel1 = ve.retorneOValorEsperado(valorSalarioMaximoNivel1, taxaParaONivel1);
            Double faixaDeDiferencaSalarialAceitaNivel1 = valorMaximoEsperadoNivel1 - valorMinimoEsperadoNivel1;
            Double impostoASerPago = salario * taxaParaONivel1;
            assertEquals(valorMinimoEsperadoNivel1, impostoASerPago, faixaDeDiferencaSalarialAceitaNivel1);
        } catch (Exception e) {
            System.out.println("Erro calculaIR " + e.getMessage());
        }
    }

    public void calculoIRParaONivel2(Double salario) {
        try {
            Double valorMinimoEsperadoNivel2 = ve.retorneOValorEsperado(faixalSalarialMínimoPagaImpostoNivel2, taxaParaONivel2);
            Double valorMaximoEsperadoNivel2 = ve.retorneOValorEsperado(valorSalarioMaximoNivel2, taxaParaONivel2);
            Double faixaDeDiferencaSalarialAceitaNivel2 = valorMaximoEsperadoNivel2 - valorMinimoEsperadoNivel2;
            Double impostoASerPago = salario * taxaParaONivel2;
            assertEquals(valorMinimoEsperadoNivel2, impostoASerPago, faixaDeDiferencaSalarialAceitaNivel2);
        } catch (Exception e) {
            System.out.println("Erro calculaIR " + e.getMessage());
        }
    }

    public void calculoIRParaONivel3(Double salario) {
        try {
            Double valorMinimoEsperadoNivel3 = ve.retorneOValorEsperado(faixalSalarialMínimoPagaImpostoNivel3, taxaParaONivel3);
            Double valorMaximoEsperadoNivel3 = ve.retorneOValorEsperado(valorSalarioMaximoNivel3, taxaParaONivel3);
            Double faixaDeDiferencaSalarialAceitaNivel3 = valorMaximoEsperadoNivel3 - valorMinimoEsperadoNivel3;
            Double impostoASerPago = salario * taxaParaONivel3;
            assertEquals(valorMinimoEsperadoNivel3, impostoASerPago, faixaDeDiferencaSalarialAceitaNivel3);
        } catch (Exception e) {
            System.out.println("Erro calculaIR " + e.getMessage());
        }
    }

    public void calculoIRParaONivel4(Double salario) {
        try {
            Double valorMinimoEsperadoNivel4 = ve.retorneOValorEsperado(faixalSalarialMínimoPagaImpostoNivel4, taxaParaONivel4);
            Double valorMaximoEsperadoNivel4 = ve.retorneOValorEsperado(valorSalarioMaximoNivel4, taxaParaONivel4);
            Double faixaDeDiferencaSalarialAceitaNivel4 = valorMaximoEsperadoNivel4 - valorMinimoEsperadoNivel4;
            Double impostoASerPago = salario * taxaParaONivel4;
            assertEquals(valorMinimoEsperadoNivel4, impostoASerPago, faixaDeDiferencaSalarialAceitaNivel4);
        } catch (Exception e) {
            System.out.println("Erro calculaIR " + e.getMessage());
        }
    }

    public Double getFaixalSalarialMínimoPagaImpostoNivel1() {
        return faixalSalarialMínimoPagaImpostoNivel1;
    }

    public Double getFaixalSalarialMínimoPagaImpostoNivel2() {
        return faixalSalarialMínimoPagaImpostoNivel2;
    }

    public Double getFaixalSalarialMínimoPagaImpostoNivel3() {
        return faixalSalarialMínimoPagaImpostoNivel3;
    }

    public Double getFaixalSalarialMínimoPagaImpostoNivel4() {
        return faixalSalarialMínimoPagaImpostoNivel4;
    }

    public Double getTaxaParaONivel1() {
        return taxaParaONivel1;
    }

    public Double getTaxaParaONivel2() {
        return taxaParaONivel2;
    }

    public Double getTaxaParaONivel3() {
        return taxaParaONivel3;
    }

    public Double getTaxaParaONivel4() {
        return taxaParaONivel4;
    }

}
