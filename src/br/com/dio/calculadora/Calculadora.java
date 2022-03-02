package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        double a , b;

        a = getDouble("Digite o primeiro valor: ");
        b = getDouble("Digiti o seguendo valor: ");

        System.out.println("A Soma entre " + a + " e " + b + " = " + somar(a,b));
        System.out.println("A Subtração de " + a + " e " + b + " = " + subtrair(a,b));
        System.out.println("A Multiplicação entre " + a + " e " + b + " = " + multiplicar(a,b));
        System.out.println("A Divisão de " + a + " e " + b + " = " + dividir(a,b));
    }
    public static double getDouble(String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.print(mensagem);
        return scan.nextDouble();
    }

    public static double somar(double a, double b ){
        return  a + b;
    }

    public static double subtrair(double a, double b ){
        return  a - b;
    }

    public static double multiplicar(double a, double b ){
        return  a * b;
    }

    public static double dividir(double a, double b ){
        return  a / b;
    }
}

