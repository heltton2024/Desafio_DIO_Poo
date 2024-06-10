package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo {

    // atributos
    private int cargaHoraria;


    // metodo de implementacao vindo da classe pai CONTEUDO
    @Override
    public double calcularXp() {
        return XP_PADRAO ;   // foi implementado no retorno a constante da classe pai
    }


    //metodo Get/Set
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //to string
    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
