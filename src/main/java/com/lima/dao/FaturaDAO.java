/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lima.dao;

import com.lima.models.Fatura;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eric
 */
public class FaturaDAO {
    
    public List<Fatura> buscarFaturasVencidas() {
        
        Fatura f1 = new Fatura("joao@joao.com",350.0, LocalDate.now().minusDays(3));
        Fatura f2 = new Fatura("maria@maria.com",150.0, LocalDate.now().minusDays(2));
        Fatura f3 = new Fatura("jose@jose.com",200.0, LocalDate.now().minusDays(5));
        
        return Arrays.asList(f1,f2,f3);
        
    }
    
}
