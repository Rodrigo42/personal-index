package br.com.fiap.model;

public class Livros {

    String titulo;
    String autor;
    String editora;
    int lancamento;
    int paginas;

    public Livros(String titulo, String autor, String editora, int lancamento, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.lancamento = lancamento;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
