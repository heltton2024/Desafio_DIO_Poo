package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //classe pai, que pod incrementar metodo e conteudo


    //atributo constante que nao pode ser mudado
    protected static final double XP_PADRAO = 10d;


    //atributo normal
    private String titulo;
    private String descricao;


    //metodo
    public abstract double calcularXp();


    //Metodos Get / Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
