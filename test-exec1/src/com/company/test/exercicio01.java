package com.company.test;

import org.junit.Assert;
import org.junit.Test;

public class exercicio01 {

    @Test
    public void verifiPalindromoTrue(){
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.isPalindromo("Top spot!");
        Assert.assertTrue(resultado);
}

    @Test
    public void verifiPalindromoFalse(){
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.isPalindromo("xyz");
        Assert.assertTrue(resultado);
    }


}
