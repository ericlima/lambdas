/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lima.email;

/**
 *
 * @author eric
 */
public class EnviarEmail {
    
    public void enviar(String to, String texto) {
        System.out.printf("Enviando email para %s. O texto %s \n", to, texto);
    }
}
