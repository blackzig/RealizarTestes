/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realizartestes.servicos;

/**
 *
 * @author Michel
 */
public class ValorEsperado {

    public Double retorneOValorEsperado(Double salario, Double taxa) {
        try {
            return salario * taxa;
        } catch (Exception e) {
            System.out.println("Erro retorneOValorEsperado " + e.getMessage());
        }
        return null;
    }
    

}
