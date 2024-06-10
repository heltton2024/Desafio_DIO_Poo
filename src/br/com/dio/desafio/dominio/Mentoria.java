package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    //atributo
    private LocalDate data;


    //metodo que veio da classe pai... conteudo
    @Override
    public double calcularXp() {
        return XP_PADRAO;   // foi implementado no retorno a constante da classe pai
    }


    //metodo Get/Set

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    //toString

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
