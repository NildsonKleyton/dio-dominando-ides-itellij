package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        System.out.println("Olá Mundo");
        double a = 3;
        double b = 5;
        System.out.println("A soma de "+a+" + " +b +" ="+ a+b);

        Gato gato = new Gato();
        gato.setCor("Preto");
        System.out.println(gato);

        Livro livro = new Livro("Mucuzulu o Principe", 300);

        System.out.println(livro);

    }

}
class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}