package br.edu.ifmt.fundamentosbd.modelo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String titulo;
    public String isbn;

    @ManyToMany
    @JoinTable(name = "autores_livros", joinColumns = @JoinColumn(name = "livro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id"))
    public Set<Autor> autores = new HashSet<>();

    public Livro(){}

    public Livro(String titutlo, String isbn) {
        this.titulo = titutlo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titutlo) {
        this.titulo = titutlo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    //JSON
    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titutlo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autores=" + autores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        return id != null ? id.equals(livro.id) : livro.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
