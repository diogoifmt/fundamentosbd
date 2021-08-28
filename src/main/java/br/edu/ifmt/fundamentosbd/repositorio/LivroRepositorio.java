package br.edu.ifmt.fundamentosbd.repositorio;

import br.edu.ifmt.fundamentosbd.modelo.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepositorio extends CrudRepository<Livro,Long> {
}
