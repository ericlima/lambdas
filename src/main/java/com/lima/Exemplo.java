/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lima;

import com.lima.dao.FaturaDAO;
import com.lima.email.EnviarEmail;
import com.lima.models.Fatura;
import java.util.List;

/**
 *
 * @author eric
 */
public class Exemplo {
    
    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
        EnviarEmail envia = new EnviarEmail();
        
        /*
        for(Fatura f : faturasVencidas) {
            envia.enviar(f.getEmailDevedor(), f.resumo());
        }
        */
        
        faturasVencidas.forEach( f -> {
            envia.enviar(f.getEmailDevedor(), f.resumo());
        });
        
    }
    
    
}
