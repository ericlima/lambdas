/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lima.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author eric
 */
public class Fatura {
    
    private String emailDevedor;
    private double valor;
    private LocalDate dataVenvimento;
    
    public Fatura(String emailDevedor, double valor, LocalDate dataVencimento) {
        this.emailDevedor = emailDevedor;
        this.valor = valor;
        this.dataVenvimento = dataVencimento;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataVenvimento() {
        return dataVenvimento;
    }

    public void setDataVenvimento(LocalDate dataVenvimento) {
        this.dataVenvimento = dataVenvimento;
    }
    
    public String resumo() {
        String dataVencimento = this.dataVenvimento.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return String.format("Valor R$ %s, vencimento: %s", this.valor, dataVenvimento);
        
    }
}
