package com.company.test;

public class Palindromo {

    public boolean isPalindromo(String frase) {

        String fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "")
                .replace(",", "").replace("/", "").replace("!", "")
                .replace(".", "").replace("'", "");

        for(int i = 0; i < fraseFiltrada.length(); i++) {
            int outroLado = fraseFiltrada.length() -i - 1;
            if(fraseFiltrada.charAt(i) != fraseFiltrada.charAt(outroLado)) {
                return false;
            }
        }

        return true;
    }
}
