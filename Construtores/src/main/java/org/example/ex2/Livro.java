package org.example.ex2;

public class Livro {
    private String tutulo;
    private String autor;
    private String isbn;
    private String numeroPaginas;
    private String valorDeCompra;

    public Livro(String tutulo, String autor, String isbn, String numeroPaginas, String valorDeCompra) {
        this.tutulo = tutulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.valorDeCompra = valorDeCompra;
    }

    public String getTutulo() {
        return tutulo;
    }

    public void setTutulo(String tutulo) {
        this.tutulo = tutulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(String valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tutulo='" + tutulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numeroPaginas='" + numeroPaginas + '\'' +
                ", valorDeCompra='" + valorDeCompra + '\'' +
                '}';
    }
}
