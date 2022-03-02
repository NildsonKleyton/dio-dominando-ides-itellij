package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

//        System.out.println("Olá Mundo");
//        double a = 3;
//        double b = 5;
//        System.out.println("A soma de "+a+" + " +b +" ="+ a+b);

        Gato gato = new Gato();
        gato.setCor("Preto");
        System.out.println(gato);

    }

}
