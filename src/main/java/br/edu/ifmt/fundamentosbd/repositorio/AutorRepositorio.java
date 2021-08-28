package br.edu.ifmt.fundamentosbd.repositorio;

import br.edu.ifmt.fundamentosbd.modelo.Autor;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepositorio extends CrudRepository<Autor, Long> {
}
